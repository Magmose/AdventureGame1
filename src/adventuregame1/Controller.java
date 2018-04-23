package adventuregame1;

import Item.Item;
import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dungeon = new Dungeon();
    ActionConverter ac = new ActionConverter();
    Action movementAction, noGameAction, attackAction;

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
        noGameAction = ac.convertAction(dir);
        attackAction = ac.convertAttack(dir);
        canDeadMenTalk();

        while (movementAction == null) {
            handleNotMovement(dir);
        }
        handleGameActionMovement(p);

    }

    private void handleGameActionMovement(Player p) {
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

    public void handleNoAction() {
        if (noGameAction == null) {

        } else {
            switch (noGameAction) {
                case Help:
                    tui.helper();
                    break;

                case Quit:
                    tui.quitter();
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }

    public void handleAttackModule() {
        if (attackAction == null) {

        } else {
            switch (attackAction) {
                case Attack:
                    break;

                case Escape:
                    break;

                default:
                    break;
            }
        }
    }

    private void handleItemAction() {
        if (noGameAction == null) {
            tui.errorInput();
        } else {
            switch (noGameAction) {
                case Use:
                    useCase();
                    break;

                case PickUp:
                    pickupCase();
                    break;

                case GetStats:
                    tui.getStats(player);
                    break;

                default:
                    break;
            }
        }
    }

    public void canDeadMenTalk() {

        if (player.getHealth() <= 0 || player.getLocation().getDescription().equalsIgnoreCase(
                "\nThe roof on this old chateau is slippery.\n"
                + "You fell to the grond and knocked yourself out. \n"
                + "it seems like it wont be that easy to escape this old building\n"
                + "Press Enter to play again")) {
            tui.youDied();
            this.go();
        }
    }

    public void useCase() {
        tui.inventoryList(player);
        String ans = tui.ask();
        player.UseItemInInventory(ans);
    }

    public void pickupCase() {
        Item itemCurrentRoom = player.getLocation().getItemInRoom();
        player.Addinventory(itemCurrentRoom);
        player.getLocation().setItemInRoom(null);
    }

    public void handleNotMovement(String dir) {
        handleNoAction();
        handleItemAction();
        handleAttackModule();
        
        dir = tui.ask();
        movementAction = ac.convertMovement(dir);
        noGameAction = ac.convertAction(dir);
    }
}
