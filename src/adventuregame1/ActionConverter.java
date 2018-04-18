package adventuregame1;

/**
 *
 * @author Christian
 */
class ActionConverter {

    Action convertMovement(String dir) {

        if (dir.equalsIgnoreCase("north")) {
            return Action.GoNorth;
        } else if (dir.equalsIgnoreCase("south")) {
            return Action.GoSouth;
        } else if (dir.equalsIgnoreCase("east")) {
            return Action.GoEast;
        } else if (dir.equalsIgnoreCase("west")) {
            return Action.GoWest;
        } else {
            return null;
        }
    }

    Action convertAction(String dir) {
        if (dir.equalsIgnoreCase("help")) {
            return Action.Help;
        } else if (dir.equalsIgnoreCase("quit")) {
            return Action.Quit;
        } else if (dir.equalsIgnoreCase("use")) {
            return Action.Use;
        } else 
            return null;
        }
}
