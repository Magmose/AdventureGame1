package adventuregame1;

import Item.Item;
import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dungeon = new Dungeon();
    ActionConverter ac = new ActionConverter();
    Action movementAction, notMovementAction;

    Room start = dungeon.createRooms();
    Player player = new Player("", start);

    public void go() {
        tui.intro();
        tui.printDesc(start.getDescription());
        while (true) {
            gameMove(start, player);
        }

    }

    public void gameMove(Room start, Player p) {

        String dir = tui.ask();
        movementAction = ac.convertMovement(dir);
        notMovementAction = ac.convertAction(dir);
        canDeadMenTalk();

        while (movementAction == null) {
            handleNotMovement();
            dir = tui.ask();
            movementAction = ac.convertMovement(dir);
            notMovementAction = ac.convertAction(dir);
        }
        switchCaseGameMovement(p);

    }

    private void switchCaseGameMovement(Player p) {
        Room location = p.getLocation();
        Room newLocation = null;
        switch (movementAction) {
            case GoNorth:
                newLocation = location.getNorth();
                break;

            case GoSouth:
                newLocation = location.getSouth();
                break;

            case GoEast:
                newLocation = location.getEast();
                break;

            case GoWest:
                newLocation = location.getWest();
                break;

        }

        if (newLocation == null) {
            tui.errorDirection();
            return;
        }
        p.setLocation(newLocation);
        tui.printDesc(p.getLocation().getDescription());
    }

    public void handleNotMovement() {
        if (notMovementAction == null) {
            tui.errorInput();
        } else {
            switch (notMovementAction) {
                case Help:
                    tui.helper();
                    break;

                case Quit:
                    tui.quitter();
                    System.exit(0);
                    break;

                case Use:
                    System.out.println(player.getInventory());
                    String ans = tui.ask();
                    player.UseItemInInventory(ans);
                    break;

                case PickUp:
                    Item itemCurrentRoom = player.getLocation().getItemInRoom();
                    player.Addinventory(itemCurrentRoom);
                    System.out.println(player.getInventory());
                    player.getLocation().setItemInRoom(null);
                    break;

                default:
                    break;
            }
        }
    }

    public void canDeadMenTalk() {
        System.out.println("virker det her lort");
        if (player.getHealth() <= 0 || player.getLocation().getDescription().equalsIgnoreCase("\nThe roof on this old chateau is slippery.\n"
                + "You fell to the grond and knocked yourself out. \n"
                + "it seems like it wont be that easy to escape this old building")) {
            tui.youDied();
            this.go();
        }
    }
}
