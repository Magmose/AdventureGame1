package Logic;

import adventuregame1.Player;
import adventuregame1.dungeon.Room;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {
     
       @Test
    public void testCreatePlayer() {
        Player player = new Player(start);
        Room result = player.getCurrentRoom();
        assertEquals("Start", start.getDescription());
    }
}
