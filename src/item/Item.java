package Item;

import adventuregame1.Player;

public class Item {

    private String name, description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void use(Player p) {

    }

    @Override
    public String toString() {
        return "Item Name: " + name + ", Description: " + description + "\n";
    }
    
}
