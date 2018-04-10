
package adventuregame1;

import java.util.Scanner;


public class TUI {
    Scanner sc = new Scanner(System.in);

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
    
}
