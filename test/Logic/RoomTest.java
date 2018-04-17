package Logic;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testCreateRooms(){
        //Arranage
        Dungeon d = new Dungeon();
        //Act
        Room start = d.createRooms();
        //Assert
        String startDescription = "\nThis is the Entrance\n"
                + "The door to the outside is locked and needs a special password to be unlocked \n"
                + "South is a grand staircase and East is a hall room";
        assertEquals("Wrong Room!", startDescription, start.getDescription());
       
        
    }

}
