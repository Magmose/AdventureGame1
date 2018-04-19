package Logic;

import Item.Item;
import Item.Potion;
import adventuregame1.Player;
import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    Dungeon d = new Dungeon();
    Room start = d.createRooms();
    Player player = new Player("", start);

    @Test
    public void testCreatePlayerInStartRoom() {

        String startDescription = "\n-----This is the Entrance-----\n"
                + "The door to the outside is locked and needs a special password to be unlocked \n"
                + "South is a grand staircase and East is a hall room";

        assertEquals(startDescription, player.getLocation().getDescription());
    }

    @Test
    public void testGoNorthWhenThereIsNoNorthRoom() {

        boolean result = player.setLocation(start.getNorth());
        assertFalse(result);
    }

    @Test
    public void testGoSouthWhenThereIsSouthRoom() {

        boolean result = player.setLocation(start.getSouth());
        assertTrue(result);
    }

    @Test
    public void testPlayerInventory() {
        Item item = new Potion("health potion", "heals you ", 4);
        player.Addinventory(item);

        assertEquals("Player inventory", player.getInventory().toString(), "[" + item.toString() + "]");
    }

}
