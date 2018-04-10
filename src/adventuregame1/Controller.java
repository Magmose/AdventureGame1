package adventuregame1;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import java.util.Scanner;

public class Controller {

    TUI tui = new TUI();
    Dungeon dungeon = new Dungeon();

    public void go() {
        Room start = dungeon.createRooms();
        gameMove(start);

    }

    public void gameMove(Room start) {

        Player p = new Player("", 0, start);
        String dir = tui.ask();
        ActionConverter ac = new ActionConverter();
        Action action = ac.convert(dir);
        while (action != null) {
            switch (action) {
                case GoNorth:
                    Room location = p.getLocation();
                    p.setLocation(location.getNorth());
                    tui.printDesc(location.getDescription());
                    break;

                case GoSouth:
                    location = p.getLocation();
                    p.setLocation(location.getSouth());
                    tui.printDesc(location.getDescription());
                    break;

                case GoEast:
                    location = p.getLocation();
                    p.setLocation(location.getEast());
                    tui.printDesc(location.getDescription());
                    break;

                case GoWest:
                    location = p.getLocation();
                    p.setLocation(location.getWest());
                    tui.printDesc(location.getDescription());
                    break;

            }
        }

    }

}
