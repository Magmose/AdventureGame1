
package item;

import adventuregame1.Player;

public class CloakOfLevitation extends Item {
        private int damage;

    public CloakOfLevitation (String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

}
