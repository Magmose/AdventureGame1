package adventuregame1.dungeon;

import Item.Item;
import Item.Potion;

public class Room {

    private String description;
    private Room east, west, north, south;
    private Item itemInRoom;

    public Item getItemInRoom() {
        return itemInRoom;
    }

    public void setItemInRoom(Item itemInRoom) {
        this.itemInRoom = itemInRoom;
    }
    public void createPotion(Potion p){
        
        this.itemInRoom = p;
    }

    public Room(String description) {
        this.description = description;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public String getDescription() {
        return description;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }
    public void pickupItemInRoom(Item itemInRoom){
        
    }

}
