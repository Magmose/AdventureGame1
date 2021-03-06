package Item;

import adventuregame1.Player;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    @Override
    public void use(Player p) {
        p.setDamage(damage);
    }
}
