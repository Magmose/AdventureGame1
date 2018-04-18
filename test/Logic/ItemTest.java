package Logic;

import Item.Item;
import Item.Poison;
import Item.Potion;
import Item.Weapon;
import adventuregame1.Player;
import adventuregame1.dungeon.Room;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ItemTest {
    
        @Test
    public void testUseWepon() {
        //Arrange
        Item item = new Weapon("Rusty Sword", "this sword is rusty", 20);
        Player player = new Player("", new Room(""));
        int expectedDamageResult = 20;
        
        //Act
        item.use(player);
        
        //Assert
        assertEquals(expectedDamageResult, player.getDamage());
    }
    
        @Test
    public void testUsePotion() {
        //Arrange
        Item item = new Potion("Potion of Life", "taste the rainbow", 20);
        Player player = new Player("", new Room(""));
        int expectedHealthResult = 120;
        
        //Act
        item.use(player);
        
        //Assert
        assertEquals(expectedHealthResult, player.getHealth());
    }
    
    
    
            @Test
    public void testUsePoison() {
        //Arrange
        Item item = new Poison("Poison of Death", "fuck off", -20);
        Player player = new Player("", new Room(""));
        int expectedHealthResult = 80;
        
        //Act
        item.use(player);
        
        //Assert
        assertEquals(expectedHealthResult, player.getHealth());
    }
    
    
    
}
