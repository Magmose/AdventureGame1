
package Monster;

import Item.Item;


public class Monster {
    private String name, description, deathDescription;
    private int health, damage;
    private Item loot;

    public Monster(String name, String description, String deathDescription, int health, int damage, Item loot) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeathDescription() {
        return deathDescription;
    }

    public void setDeathDescription(String deathDescription) {
        this.deathDescription = deathDescription;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Item getLoot() {
        return loot;
    }

    public void setLoot(Item loot) {

    }

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", description=" + description + '}';
    }
    
    
    
}
