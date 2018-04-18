package Item;

import adventuregame1.Player;

public class Poison extends Item {

    private int heals = -20;

    public Poison(String name, String description, int damage) {
        super(name, description);
        this.heals = heals;
    }

    @Override
    public void use(Player p) {
        p.setHealth(heals);
    }
}
