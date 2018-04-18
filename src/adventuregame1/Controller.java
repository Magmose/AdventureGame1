package adventuregame1;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dungeon = new Dungeon();
    ActionConverter ac = new ActionConverter();
    Action action;

    public void go() {
        Room start = dungeon.createRooms();
        tui.intro();
        tui.printDesc(start.getDescription());
        Player p = new Player("", start);
        while (true) {
            gameMove(start, p);
        }

    }

    public void gameMove(Room start, Player p) {

        String dir = tui.ask();
        action = ac.convert(dir);

        while (action == null) {
            if (dir.equalsIgnoreCase("help")) {
                tui.helper();
            }

            if (dir.equalsIgnoreCase("quit")) {
                tui.quitter();
                System.exit(0);
            }
            // Lav if(dir.equalsIgnorecase("quit")) til use item
            
            tui.errorInput();
            dir = tui.ask();
            action = ac.convert(dir);
        }
        switchCaseGameMovement(p);

    }

    private void switchCaseGameMovement(Player p) {
        Room location = p.getLocation();
        Room newLocation = null;
        switch (action) {
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

}
