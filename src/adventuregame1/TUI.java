package adventuregame1;

import java.util.Scanner;

public class TUI {

    Scanner sc = new Scanner(System.in);

    void intro() {
        System.out.println("WELOCOME TO THE ADVENTURE GAME!");
        System.out.println("Find your way through the chateau with your compass");
        System.out.println("Each room in the game has up to 4 doors, which you can access by writing north, east, south, or west.\n"
                + " you can quit the game by typing \"Quit\" and get help by typing \"Help\" \n"
                + "good luck... \n \n"
                + "You are waking up at the entrance of an abandoned old Chateau. \n"
                + "The only thing lighting up your way is the moonlight shinging though the grand windows");

    }

    void printDesc(String description) {
        System.out.println(description);
    }

    String ask() {
        String s = sc.nextLine();
        return s;
    }

    void errorInput() {
        System.out.println("Nothing happened");
    }

    void errorDirection() {
        System.out.println("No room exists in that direction, try something else adventurer");
    }

    void quitter() {
        System.out.println("LOOSER!");
    }

    void helper() {
        System.out.println("All you can do in this game is use your compass..\n"
                + "You can only go north, south, east or west in this game\n"
                + "Remember to spell it correctly");
    }
}
