package adventuregame1.dungeon;

public class Dungeon {

    public Room createRooms() {
        Room start = new Room("Start: You are waking up at the entrance of an abandoned old Chateau." +
                "The door to the outside is locked and needs a special password to be unlocked");
        Room room1 = new Room("This is a grand hall. \nFrom here you can go to the Billiard Room and to the lounge");
        Room room2 = new Room("This is the lounge room. \nFrom here you can go to a narrow hallway or up a small staircase ");
        Room room3 = new Room("This is a grand staircase to the second floor of the house");
        Room room4 = new Room("This is the Billiard Room ");
        Room room5 = new Room("This is a narrow hallway." +
                "\nAll the foors are locked. It seems to have been chambers for servants." +
                "\ndo you want to go further through the hallways or go back?");
        Room room6 = new Room("This is a grand hallway." +
                "\n there is a large hole in the floor but it seems like it can be jumped \n" +
                "There is also a safer way through a door that seems to go to the kitchen");
        Room room7 = new Room("This is a narrow hallway." +
                "All the doors are locked! It seems to have been chambers for servants \n" +
                "do you want to go further through the hallways or go back?");
        Room room8 = new Room("This is a narrow hallway." +
                "\nAll the doors are locked!" +
                "\n It splits up and you can go both left and right down two other hallways." +
                "\ndo you want to go further through the hallways or go back?");
        Room room9 = new Room("This is the Kitchen \nThere is a door to a grand dining room from here." +
                "\n there is also an open window? perhaps you can escape from here ");
        Room room10 = new Room("This is a narrow hallway." +
                "all the doors are locked! \n there is a large hole in the ceiling" + 
                "\ndo you want to go further through the hallways or go back?");
        Room room11 = new Room("This is a narrow hallway. all the doors are locked! \n it seems to have been chambers for servants" +
                "\ndo you want to go further through the hallways or go back?");
        Room theWindow = new Room("The roof on this old chateau is slippery. You fell to the grond and knocked yourself out. \n" +
                "it seems like it wont be that easy to escape this old building");
        Room room12 = new Room("This is the Grand Dining Room! \n" +
                "There are multiple doors here. you can go to to the study, the master bedroom and a ballroom!");
        Room room13 = new Room("This is the conservatory.");
        Room room14 = new Room("This is the study.");
        Room room15 = new Room("This is the ballroom from here you can go to three smaller bedrooms");
        Room room16 = new Room("This is the master bedroom. \n"+
                "there seems to be a hidden passage downsairs");
        Room room17 = new Room("bedroom 1");
        Room room18 = new Room("bedroom 2");
        Room room19 = new Room("bedroom 3");
        
        
        
        //Start
        start.setEast(room1);
        start.setSouth(room3);
        
        //Room 1 = grand hall
        room1.setWest(start);
        room1.setSouth(room4);
        room1.setEast(room2);
        
        //Room 2 = lounge room
        room2.setWest(room1);
        room2.setEast(room13);
        room2.setSouth(room5);
        
        //room 3 = Grand staircase
        room3.setNorth(start);
        room3.setSouth(room6);
        
        //rom 4 = billiard room
        room4.setNorth(room1);
       
        //room 5 = narrow hallway
        room5.setNorth(room2);
        room5.setSouth(room8);
        
        //room 6 = grand hallway
        room6.setNorth(room3);
        room6.setSouth(room9);
        
        //room 7 = narrow hallway left side of loop
        room7.setEast(room8);
        room7.setSouth(room10);
        
        //room 8 = narrow hallway begining of loop
        room8.setNorth(room5);
        room8.setSouth(room11);
        room8.setWest(room7);
        
        //room 9 = kitchen
        room9.setNorth(room6);
        room9.setEast(room12);
        
        //room 10 = narrow hallway hole in ceeling 
        room10.setNorth(room7);
        room10.setEast(room11);
        
        //room 11 = narrow hallway right side of loop
        room11.setNorth(room8);
        room11.setWest(room10);
        
        //the window --> Game starts over
        
        //room 12 = grand dining room
        room12.setNorth(room9);
        room12.setSouth(room15);
        room12.setEast(room16);
        room12.setWest(room14);
        
        //room 13 = conservatory 
        room13.setNorth(room2);
        
        //room 14 = the study
        room14.setNorth(room12);
        
        //room 15 = the ballroom
        room15.setEast(room19);
        room15.setSouth(room18);
        room15.setWest(room17);
        
        //room 16 = the master bedroom 
        room16.setNorth(room12);
        room16.setEast(room5);
        
        //room 17 = small bedroom 1
        room17.setNorth(room15);
        
        //room 18 = small bedroom 2
        room18.setNorth(room15);
        
        //room 19 = small bedroom 3
        room19.setNorth(room15);
        
        return start;
    }
}
