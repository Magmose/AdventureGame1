package Logic;

import adventuregame1.dungeon.Dungeon;
import adventuregame1.dungeon.Room;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    //Arrange    
    Dungeon d = new Dungeon();
    //Act
    Room start = d.createRooms();

    @Test
    public void testCreateRooms() {
        //Assert
        String startDescription = "\n-----This is the Entrance-----\n"
                + "The door to the outside is locked and needs a special password to be unlocked \n"
                + "South is a grand staircase and East is a hall room";
        assertEquals("Wrong Room!", startDescription, start.getDescription());
    }

    @Test
    public void testConnectWest() {
        Room room1 = d.createRooms().getEast();
        assertEquals("trying to move west", start.getDescription(), room1.getWest().getDescription());
    }

    @Test
    public void testConnectEast() {
        Room room1 = d.createRooms().getEast();
        assertEquals("trying to move East", room1.getDescription(), start.getEast().getDescription());
    }

    @Test
    public void testConnectSouth() {
        Room room3 = d.createRooms().getSouth();
        assertEquals("trying to move south", room3.getDescription(), start.getSouth().getDescription());
    }

    @Test
    public void testConnectNorth() {
        Room room3 = d.createRooms().getSouth();
        assertEquals("trying to move North", start.getDescription(), room3.getNorth().getDescription());
    }

    @Test
    public void testGetRoomInMazeWithOnlyOneRoom() {
        Room room = new Room("Start room");
        Room result = room.getEast();
        assertNull(result);
        result = room.getWest();
        assertNull(result);
        result = room.getNorth();
        assertNull(result);
        result = room.getSouth();
        assertNull(result);
    }

}
