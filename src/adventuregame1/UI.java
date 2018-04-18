package adventuregame1;

import adventuregame1.dungeon.Room;
import java.util.Random;
import java.util.Scanner;

public class UI {

    
    private int i = 0;
    Scanner sc = new Scanner(System.in);

    public int g_Damage(int health) {
        health -= 20;   
        
        return health;
    }

    public int g_Heal(int health) {
        health += 15;
        return health;
    }

    public String Room(Room r) { 
        return r.getDescription();
    }
}
