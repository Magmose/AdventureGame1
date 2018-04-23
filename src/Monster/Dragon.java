
package Monster;

import Item.Item;
import Item.Potion;


public class Dragon extends Monster {
    
    public Dragon(String name, String description, String deathDescription, int health, int damage, Item loot) {
        super(name, description, deathDescription, health, damage, loot);
    }
    public void setLoot() {
        Item potion = new Potion("Potion","This will heal you", 50);
    }
    
}
