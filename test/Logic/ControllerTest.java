package Logic;

import Item.Item;
import Item.Potion;
import adventuregame1.Player;
import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import org.junit.Test;
import static org.junit.Assert.*;


public class ControllerTest {
    Dungeon d = new Dungeon();
    Room start = d.createRooms();
    Player player = new Player("", start);
    Item item = new Potion("Potion", "Health", 30);
    
    @Test
    public void nothingInInventoryTest() {
        start.setItemInRoom(item);
        assertEquals(0, player.getInventory().size());
    }
    
        @Test
    public void pickUpToInventoryTest() {
        start.setItemInRoom(item);
        player.Addinventory(item);
        assertEquals(1, player.getInventory().size());
        assertEquals("Health", player.getInventory().get(0).getDescription());
    }
    
}
