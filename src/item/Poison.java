package Item;

import adventuregame1.Player;

public class Poison extends Item {

    private int damage = -20;

    public Poison(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    @Override
    public void use(Player p) {
        p.setHealth(damage);
    }
}
