
package adventuregame1;

import adventuregame1.dungeon.Room;

public class Player {

    private String name;
    private int health;
    private int damage;
    private Room location;
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
        this.damage += damage;
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

    public void setLocation(Room location) {
        this.location = location;

    }

    public Room getLocation() {
        return location;
    }

}
