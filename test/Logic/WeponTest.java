package Logic;

import Item.Item;
import Item.Weapon;
import static org.junit.Assert.assertEquals;
import adventuregame1.Player;
import adventuregame1.dungeon.Room;
import org.junit.Test;



public class WeponTest {
    
    @Test
    public void testUseWepon() {
        //Arrange
        Item item = new Weapon("Sword of Rust", "a rusty sword", 5);
        Player player = new Player("", new Room(""));
        int expectedDamageResult = 15;
        
        //Act
        item.use(player);
        
        //Assert
        assertEquals(expectedDamageResult, player.getDamage());
    }
    
}
