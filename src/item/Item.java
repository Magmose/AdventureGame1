package Item;

import adventuregame1.Player;

public class Item {

    private String name, description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void use(Player p) {
        //do nothing at the moment 
        //puts in backpack
        //p.adItemToBackpack(this);
    }

    @Override
    public String toString() {
        return "Item: " + name + description + "\n ";
    }
    

}
