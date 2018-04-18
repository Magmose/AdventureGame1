package adventuregame1;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    Dungeon dungeon = new Dungeon();
    Player p = new Player("", dungeon.createRooms());
    UI ui = new UI();
    public void go() {
        dungeon.createRooms();
        gameStart();
        commandInput();
        
    }


    public void gameStart() {

        System.out.println("Welcome to the magical adventure game! \nWould you like the instructions ? ");
        String startAnswer = sc.nextLine();

        if (startAnswer.toLowerCase().equals("yes")) {
            
            System.out.println("Enter your name");
            p.setHealth(100);
            p.setName(sc.nextLine());
            
            System.out.println("name: " + p.getName() + " Health: " + p.getHealth());
            
            p.setHealth(ui.g_Damage(p.getHealth()));
            System.out.println("New health: " + p.getHealth());
            
            System.out.println("There is no story at this point... \n"
                    + "You will have the ability to direct aroud in this world by using commands of one or two words \n"
                    + "If you are stuck you will have the ability to write \"HELP\" for hints or \"QUIT\" if you give up.");
        }
        if (startAnswer.toLowerCase().equals("no")) {
            commandQuit();
        }

    }

    public void commandInput() {
        String answer = sc.nextLine();

        if (answer.toLowerCase().equals("help")) {
            commandHelp();
        }
        if (answer.toLowerCase().equals("quit")) {
            commandQuit();
        }

    }

    public void commandQuit() {
        System.out.println("Game Stopped");
        System.exit(0);
    }

    public String commandHelp() {
        String s = new Help().getCommand();
        System.out.println("HELP");
        return s;

    }
}
