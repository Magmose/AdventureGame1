package Monster;

import Item.Item;
import Item.Potion;
import Monster.Monster;

public class Goblin extends Monster {

    public Goblin(String name, String description, String deathDescription, int health, int damage, Item loot) {
        super(name, description, deathDescription, health, damage, loot);
    }

    public void setLoot() {
        Item potion = new Potion("Potion", "This will heal you", 50);
    }
}
