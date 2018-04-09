package adventuregame1.dungeon;

public class Room {
    
    private String description;
    private String east,west,north,south;

    public Room(String description, String east, String west, String north, String south) {
        this.description = description;
        this.east = east;
        this.west = west;
        this.north = north;
        this.south = south;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getDescription() {
        return description;
    }

    public String getEast() {
        return east;
    }

    public String getWest() {
        return west;
    }

    public String getNorth() {
        return north;
    }

    public String getSouth() {
        return south;
    }
    
    
}
