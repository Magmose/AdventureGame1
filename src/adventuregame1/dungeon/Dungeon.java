package adventuregame1.dungeon;

public class Dungeon {

    public void createRooms() {
        Room room1 = new Room("");
        Room room2 = new Room("");
        Room room3 = new Room("");

        //Start
        room1.setEast(room2);
        room2.setWest(room1);
    }
}
