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

    void youDied() {
        System.out.println("Weakling you died to such a simple maze!\n");
    }

    void quitter() {
        System.out.println("LOSER!");
    }

    void helper() {
        System.out.println("All you can do in this game is use your compass...\n"
                + "You can only go north, south, east or west in this game\n"
                + "Additionally, you can pickup items in your current room by writing \"pickup\"\n"
                + "If you write \"use\", you'll be able to see what items you currently have in your inventory.\n"
                + "After that you can write the name of any of the items listed to use or equip them.\n"
                + "If you want too se your current stats just type \"use\"."
                + "Remember to spell it correctly");
    }

    void getStats(Player p) {
        System.out.println("Your current stats are: Damage = " + p.getDamage() + ", and Health = " + p.getHealth());
    }

    public void inventoryList(Player p) {
        String result = "\nCurrent Inventory:\n";
        for (int i = 0; i < p.getInventory().size(); i++) {
            result += "" + p.getInventory().get(i);
        }
        System.out.println(result);
    }

}
