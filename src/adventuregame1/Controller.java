package adventuregame1;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import java.util.Scanner;

public class Controller {

    TUI tui = new TUI();
    Dungeon dungeon = new Dungeon();

    public void go() {
        Room start = dungeon.createRooms();
        tui.intro();
        tui.printDesc(start.getDescription());
        Player p = new Player("", 0, start);
        while (true) {
            gameMove(start, p);
        }

    }

    public void gameMove(Room start, Player p) {
        ActionConverter ac = new ActionConverter();
        Action action;
        String dir = tui.ask();
        action = ac.convert(dir);

        if (dir.equalsIgnoreCase("quit")) {
            tui.quitter();
            System.exit(0);
        }

        if (dir.equalsIgnoreCase("help")) {
            tui.helper();
        }

        while (action == null) {
            tui.errorInput();
            dir = tui.ask();
            action = ac.convert(dir);
        }
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
