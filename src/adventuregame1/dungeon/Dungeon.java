package adventuregame1.dungeon;

import Item.Item;
import Item.Poison;
import Item.Potion;
import Item.Weapon;
import Item.Cloak;

public class Dungeon {

    public Room createRooms() {
        Room start = new Room("\n-----This is the Entrance-----\n"
                + "The door to the outside is locked and needs a special password to be unlocked \n"
                + "South is a grand staircase and East is a hall room");
        Room room1 = new Room("\n-----This is the Grand Hall----- \n"
                + "From here you can go South to the Billiard Room, East to a Lounge Room or west to the Entrance");
        Room room2 = new Room("\n-----This is the Lounge Room----- \n"
                + "From here you can go South to a Narrow Hallway go East up a small staircase or go west to the Grand hall");
        Room room3 = new Room("\n-----This is a grand staircase to the second floor of the house-----\n"
                + "You can go north to the Entrance or South to a Hallway");
        Room room4 = new Room("\n-----This is the Billiard Room-----\n"
                + "There is nothing here but old furniture and a Posion that heals \n"
                + "You can go back north");
        Room room5 = new Room("\n-----This is a narrow hallway-----\n"
                + "All the foors are locked. It seems to have been chambers for servants.\n"
                + "Do you want to go further through the hallways by going South or North?");
        Room room6 = new Room("\n-----This is a Grand Hallway-----\n"
                + "There is a large hole in the floor in the East direction but it seems like it can be jumped! \n"
                + "There is also a safer way through a door that seems to go south to a Kitchen\n"
                + "North is the Grand Staircase");
        Room room7 = new Room("\n-----This is a narrow hallway-----\n"
                + "All the doors are locked! It seems to have been chambers for servants \n"
                + "Do you want to go further through the hallways by going South or East?");
        Room room8 = new Room("\n-----This is a narrow hallway-----"
                + "\nAll the doors are locked!"
                + "\nIt splits up and you can go both West and South down two other hallways."
                + "\ndo you want to go further through the hallways or go back North?");
        Room room9 = new Room("\n-----This is the Kitchen-----\n"
                + "There is a door to a Grand Dining room East from here or you can go North to the Hallway\n"
                + "There is also an open window at South? perhaps you can escape from here?");
        Room room10 = new Room("\n-----This is a narrow hallway-----\n"
                + "All the doors are locked! \nthere is a large hole in the ceiling\n"
                + "Do you want to go further through the hallway to East or North?");
        Room room11 = new Room("\n-----This is a narrow hallway-----\n "
                + "All the doors are locked! It seems to have been chambers for servants"
                + "\ndo you want to go further through the hallways by going West or North?");
        Room theWindow = new Room("\nThe roof on this old chateau is slippery.\n"
                + "You fell to the grond and knocked yourself out. \n"
                + "it seems like it wont be that easy to escape this old building\n"
                + "Press Enter to play again");
        Room room12 = new Room("\n-----This is the Grand Dining Room----- \n"
                + "There are multiple doors here.\n"
                + "You can go West to the Study, East to a Bedroom, South to a Ballroom or North to the Kitchen!");
        Room room13 = new Room("\n-----This is the conservatory-----\n"
                + "There are some large windows in here.\n"
                + "There would have been a beautifull view here if it wasnt for all "
                + "the dead bodies outside and that creepy guy with the axe...\n"
                + "You can go back North down the staricase");
        Room room14 = new Room("\n-----This is the study-----\n"
                + "There is nothing here other than a large Crossbow?\n"
                + "You can go back East to the Dining Room");
        Room room15 = new Room("\n-----This is the Ballroom-----\n"
                + "From here you can go to three smaller bedrooms West, South and East or go North to the Dining Room");
        Room room16 = new Room("\n-----This is the Master Bedroom----- \n"
                + "There seems to be a hidden hole going to the first floor at the east side of the room?\n"
                + "You can go back West to the Dining Room");
        Room room17 = new Room("\n -----This is a smaller bedroom-----\n"
                + "there is a lot of bottles and flasks on the shelfs.\n"
                + "You can go back by going North");
        Room room18 = new Room("\n-----This is the a smaller bedroom-----\n"
                + "There is nothing here yet.. perhaps next week?\n"
                + "You can go back North to the Ballroom");
        Room room19 = new Room("\n-----This is a smaller bedroom-----\n"
                + "There is a beautifull princess here!"
                + "Congratulations! YOU WON!!");

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
        room4.setItemInRoom(new Potion("potion", "A health potion that heals for 30 hitpoints", 30));

        
        //room 5 = narrow hallway
        room5.setNorth(room2);
        room5.setSouth(room8);

        //room 6 = grand hallway
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.setEast(room10);

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
        room9.setSouth(theWindow);

        //room 10 = narrow hallway hole in ceeling 
        room10.setNorth(room7);
        room10.setEast(room11);

        //room 11 = narrow hallway right side of loop
        room11.setNorth(room8);
        room11.setWest(room10);

        //the window --> Game starts over
//        theWindow.setNorth(start);

        //room 12 = grand dining room
        room12.setNorth(room9);
        room12.setSouth(room15);
        room12.setEast(room16);
        room12.setWest(room14);

        //room 13 = conservatory 
        room13.setNorth(room2);

        //room 14 = the study
        room14.setEast(room12);
        room14.setItemInRoom(new Weapon("Magic Crossbow", "This magical croosbow is very deadly, and equipping it will set your damage to 30", 30));

        //room 15 = the ballroom
        room15.setEast(room19);
        room15.setSouth(room18);
        room15.setWest(room17);

        //room 16 = the master bedroom 
        room16.setWest(room12);
        room16.setEast(room5);  

        //room 17 = small bedroom 1
        room17.setItemInRoom(new Poison("Poison", "The poison has a deadly odor, and could be used to end your misery", -1000));
        room17.setNorth(room15);

        //room 18 = small bedroom 2
        room18.setNorth(room15);

        //room 19 = small bedroom 3
        room19.setNorth(room15);

        Item item = new Cloak("", "", "");
        room19.setItemInRoom(new Cloak("", "", "red"));
        return start;
    }
}
