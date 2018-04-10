/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame1;

/**
 *
 * @author Christian
 */
class ActionConverter {

    Action convert(String dir) {

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
}
