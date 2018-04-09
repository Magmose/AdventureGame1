package adventuregame1;

import adventuregame1.dungeon.Help;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);

    public void go() {

    }

    public void commandInput() {
        
    }

    public void commandQuit() {
        System.exit(0);
    }

    public String commandHelp() {
        String s = new Help().getCommand();
        return s;
    }
}
