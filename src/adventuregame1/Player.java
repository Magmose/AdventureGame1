package adventuregame1;

import adventuregame1.dungeon.Room;


public class Player {

    private String name;
    private int health;
    private Room location;

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
        this.health = health;
    }

    public void setLocation(Room location) {
        this.location = location;
        
    }

    public Player(String name, int health, Room location) {
        this.name = name;
        this.health = health;
        this.location = location;
    }

    public Room getLocation() {
        return location;
    }

}
