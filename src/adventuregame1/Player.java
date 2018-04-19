package adventuregame1;

import Item.Item;
import adventuregame1.dungeon.Room;
import java.util.ArrayList;

public class Player {

    private String name;
    private int health;
    private int damage;
    private Room location;
    private ArrayList<Item> inventory = new ArrayList();

    public ArrayList<Item> getInventory() {
        return inventory;
    }

//    private static final int DAMAGE_FROM_START = 10;
    public Player(String name, Room location) {
        this.name = name;
        this.location = location;
        health = 100;
        damage = 10;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public void UseItemInInventory(String str) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equalsIgnoreCase(str)) {
                inventory.get(i).use(this);
                inventory.remove(i);
            }
        }
    }

    public void Addinventory(Item item) {
        inventory.add(item);
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == null) {
                inventory.remove(i);
            }
        }
    }

    public boolean setLocation(Room location) {
        this.location = location;
        if (location == null) {
            return false;
        }
        return true;
    }

    public Room getLocation() {
        return location;
    }
    
}
