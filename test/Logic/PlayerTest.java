package Logic;

import adventuregame1.Player;
import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testCreatePlayerInStartRoom() {
        Dungeon d = new Dungeon();
        Room start = d.createRooms();
        Player player = new Player("", 0, start);
        String startDescription = "\nThis is the Entrance\n"
                + "The door to the outside is locked and needs a special password to be unlocked \n"
                + "South is a grand staircase and East is a hall room";

        assertEquals(startDescription, player.getLocation().getDescription());
    }

    @Test
    public void testGoNorthWhenThereIsNoNorthRoom() {
        Dungeon d = new Dungeon();
        Room start = d.createRooms();
        Player player = new Player("", 0, start);
        Action.

        boolean result
        assertFalse(result);
    }
}
