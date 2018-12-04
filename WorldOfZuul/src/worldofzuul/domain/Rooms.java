package worldofzuul.domain;

import worldofzuul.command.CommandWord;

/**
 *
 * @author Rene_
 */
public class Rooms {
    
    private static int roomCounter = 0;
    
    private static Room currentRoom;

    //First floor
    private static Room startRoom, f1_A1, f1_B1, f1_C1, f1_A2, f1_B2, f1_C2, f1_A3, f1_B3, f1_C3;

    //Second floor
    private static Room f2_A1, f2_B1, f2_C1,
            f2_A2, f2_B2, f2_C2, f2_D2,
            f2_A3, f2_B3, f2_C3, f2_D3,
            f2_A4, f2_B4, f2_C4, f2_D4,
            f2_A5, f2_B5, f2_C5, f2_D5;

    //Third floor
    private static Room f3_A1, f3_B1, f3_C1, f3_D1, f3_E1, f3_F1,
            f3_A2, f3_B2, f3_C2, f3_D2, f3_E2, f3_F2,
            f3_A3, f3_B3, f3_C3, f3_D3, f3_E3, f3_F3,
            f3_A4, f3_B4, f3_C4, f3_D4, f3_E4, f3_F4,
            f3_A5, f3_B5, f3_C5, f3_D5, f3_E5, f3_F5,
            f3_A6, f3_B6, f3_C6, f3_D6, f3_E6, f3_F6,
            f3_A7, f3_B7, f3_C7, f3_D7, f3_E7, f3_F7,
            endRoom;

    public static void createRooms() {

        //First floor rooms
        startRoom = new Room("Welcome to Temple Raider! /n  This is an adventure game. /n Type '" + CommandWord.HELP + "' if you need help. /n"
                + "You’re in the jungle in Belize.\n"
                + "You, the Archeologist “El Whipper”, has through 16 years of devoted research, looked for ancient Mayan\n"
                + "treasures. You now stand before the possibly greatest treasure to ever see the light of day. Will you\n"
                + "succeed in finding the treasure or will you succumb to the dangers of the temple. It is up to you!", "Rooms/StartRoom.png");

        f1_A1 = new Room("You’re standing in a dark room.", "Rooms/F1_A1.png");
        f1_B1 = new Room("The door to the outside is sealed shut.\n"
                + "A statue is standing in the middle of the room, it’s eyes starts to glow and it utters: “This ancient temple\n"
                + "contains many secret treasures, but dangers lurk within, many have tried, but none have succeeded in\n"
                + "obtaining the legendary jade statue”", "Rooms/F1_B1.png");
        f1_C1 = new Room("You spot on the floor, a whip lying in the dust.", "Rooms/F1_C1.png");

        f1_A2 = new Room("","Rooms/F1_A2.png");
        f1_B2 = new Room("The door in front of you is locked, answer the statues puzzle to continue through.","Rooms/F1_B2.png", "Rooms/F1_B2U.png");
        f1_C2 = new Room("You enter the room and spot a large shadow out of the corner of your eye, before you can get a good look\n"
                + "at it, it disappears.", "Rooms/F1_C2.png");

        f1_A3 = new Room("", "Rooms/F1_A3.png");
        f1_B3 = new Room("You stand in front of a pit and see a large branch on the other side of it, it is out of your reach, but it looks stable and\n"
                + "solid.", "Rooms/F1_B3.png");
        f1_C3 = new Room("", "Rooms/F1_C3.png");

        //Second floor rooms
        f2_A1 = new Room("");
        f2_B1 = new Room("You feel your soul connecting with the gemstones in the floor. The way forward is deeper and darker than before.");
        f2_C1 = new Room("You’re standing in a dark room.");

        f2_A2 = new Room("You see a lever high up on the wall, it is out of your reach");
        f2_B2 = new Room("");
        f2_C2 = new Room("");
        f2_D2 = new Room("");

        f2_A3 = new Room("You’re standing in a dark room.");
        f2_B3 = new Room("");
        f2_C3 = new Room("The doors around you are locked, answer this puzzle correct to continue through.");
        f2_D3 = new Room("You see a button on the other side of a large gap, it is out of your reach .");

        f2_A4 = new Room("You see a torch hanging on the wall, do you want to pick it up?");
        f2_B4 = new Room("");
        f2_C4 = new Room("");
        f2_D4 = new Room("You spot a gas mask on the corpse of a dead Nazi soldier.");

        f2_A5 = new Room("The only way forward is down through the hole in the floor, you see a branch sturdy enough to hold your weight.");
        f2_B5 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f2_C5 = new Room("You smell gas coming from the door to the east");
        f2_D5 = new Room("The room is full of gas. Fortunately you have your gas mask on, and you find a valuable treasure on the ground");

        //Third floor rooms
        f3_A1 = new Room("You stand in a dark room");
        f3_B1 = new Room("You feel your soul connect with the large gemstone once again.");
        f3_C1 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f3_D1 = new Room("You are presented with a riddle, answer it to move on.");
        f3_E1 = new Room("You feel the large gemstone connect with your soul once again. \n"
                + "");
        f3_F1 = new Room("");

        f3_A2 = new Room("");
        f3_B2 = new Room("");
        f3_C2 = new Room("You’re stuck in a room, and have to answer this riddle to move on.");
        f3_D2 = new Room("You spot a green key");
        f3_E2 = new Room("");
        f3_F2 = new Room("");

        f3_A3 = new Room("You stand in a dark room");
        f3_B3 = new Room("");
        f3_C3 = new Room("");
        f3_D3 = new Room("You see a pair of guns lying on the floor.");
        f3_E3 = new Room("");
        f3_F3 = new Room("A large lever is in the room, pulling it may open the shut door to the west");

        f3_A4 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f3_B4 = new Room("");
        f3_C4 = new Room("");
        f3_D4 = new Room("");
        f3_E4 = new Room("");
        f3_F4 = new Room("You spot a somewhat familiar hat near the dead person");

        f3_A5 = new Room("You find a blue key");
        f3_B5 = new Room("");
        f3_C5 = new Room("");
        f3_D5 = new Room("");
        f3_E5 = new Room("");
        f3_F5 = new Room("You’re stuck in a room, and have to answer this riddle to move on.");

        f3_A6 = new Room("");
        f3_B6 = new Room("");
        f3_C6 = new Room("");
        f3_D6 = new Room("The button to open the door is high up, and you can't reach it with your bare hands");
        f3_E6 = new Room("");
        f3_F6 = new Room("");

        f3_A7 = new Room("The bonus here seems unusally large, and definitely worth collecting");
        f3_B7 = new Room("");
        f3_C7 = new Room("");
        f3_D7 = new Room("Answer this riddle to continue. You feel the pressure from behind the door, something is behind it.");
        f3_E7 = new Room("");
        f3_F7 = new Room("You find a green key");

        endRoom = new Room("The final room! On the pedestal in the middle of the room, you spot the long sought after Jade Statue");

        //First floor exits
        startRoom.setExit("north", f1_B1);

        f1_A1.setExit("north", f1_A2);
        f1_A1.setExit("east", f1_B1);

        f1_B1.setExit("west", f1_A1);
        f1_B1.setExit("east", f1_C1);

        f1_C1.setExit("west", f1_B1);

        f1_A2.setExit("east", f1_B2);
        f1_A2.setExit("south", f1_A1);

        f1_B2.setExit("east", f1_C2);
        f1_B2.setExit("west", f1_A2);

        f1_C2.setExit("north", f1_C3);
        f1_C2.setExit("west", f1_B2);

        f1_A3.setExit("east", f1_B3);

        f1_B3.setExit("west", f1_A3);
        f1_B3.setExitWithColor("north", f2_B1,"whip");
        f1_B3.setExit("east", f1_C3);

        f1_C3.setExit("west", f1_B3);
        f1_C3.setExit("south", f1_C2);

        //Second floor exits
        f2_A1.setExit("north", f2_A2);
        f2_A1.setExit("east", f2_B1);

        f2_B1.setExit("north", f2_B2);
        f2_B1.setExit("east", f2_C1);
        f2_B1.setExit("south", f1_B3);
        f2_B1.setExit("west", f2_A1);

        f2_C1.setExit("north", f2_C2);
        f2_C1.setExit("west", f2_B1);

        f2_A2.setExitWithColor("north", f2_A3,"whip");
        f2_A2.setExit("south", f2_A1);

        f2_B2.setExit("north", f2_B3);
        f2_B2.setExit("south", f2_B1);

        f2_C2.setExit("north", f2_C3);
        f2_C2.setExit("east", f2_D2);
        f2_C2.setExit("south", f2_C1);

        f2_D2.setExit("north", f2_D3);
        f2_D2.setExit("west", f2_C2);

        f2_A3.setExit("north", f2_A4);
        f2_A3.setExit("east", f2_B3);
        f2_A3.setExitWithColor("south", f2_A2,"whip");

        f2_B3.setExit("west", f2_A3);
        f2_B3.setExit("south", f2_B2);
        f2_B3.setExit("east", f2_C3);

        f2_C3.setExit("north", f2_C4);
        f2_C3.setExit("south", f2_C2);
        f2_C3.setExitWithColor("east", f2_D3,"whip");
        f2_C3.setExit("west", f2_B3);

        f2_D3.setExitWithColor("west", f2_C3,"whip");
        f2_D3.setExit("south", f2_D2);

        f2_A4.setExit("south", f2_A3);

        f2_B4.setExit("east", f2_C4);

        f2_C4.setExit("north", f2_C5);
        f2_C4.setExit("south", f2_C3);
        f2_C4.setExit("east", f2_D4);
        f2_C4.setExit("west", f2_B4);

        f2_D4.setExit("west", f2_C4);

        f2_A5.setExitWithColor("north", f3_B1,"whip");
        f2_A5.setExit("east", f2_B5);

        f2_B5.setExit("east", f2_C5);
        f2_B5.setExit("west", f2_A5);

        f2_C5.setExit("south", f2_C4);
        f2_C5.setExitWithColor("east", f2_D5,"whip");
        f2_C5.setExit("west", f2_B5);

        f2_D5.setExit("north", f3_E1);
        f2_D5.setExit("west", f2_C5);

        //Third floor exits
        // Lag 1
        f3_A1.setExit("north", f3_A2);
        f3_A1.setExit("east", f3_B1);

        f3_B1.setExit("east", f3_C1);
        f3_B1.setExit("north", f3_B2);
        f3_B1.setExit("west", f3_A1);
        f3_B1.setExitWithColor("south", f2_A5,"whip");

        f3_C1.setExit("west", f3_B1);
        f3_C1.setExit("north", f3_C2);

        f3_D1.setExit("east", f3_E1);
        f3_D1.setExit("north", f3_D2);

        f3_E1.setExit("east", f3_F1);
        f3_E1.setExit("west", f3_D1);
        f3_E1.setExit("south", f2_D5);

        f3_F1.setExit("west", f3_E1);
        f3_F1.setExit("north", f3_F2);

        // Lag 2
        f3_A2.setExit("north", f3_A3);
        f3_A2.setExit("south", f3_A1);

        f3_B2.setExit("north", f3_B3);
        f3_B2.setExit("south", f3_B1);
        f3_B2.setExit("east", f3_C2);

        f3_C2.setExit("west", f3_B2);
        f3_C2.setExit("north", f3_C3);
        f3_C2.setExit("south", f3_C1);

        f3_D2.setExit("south", f3_D1);
        f3_D2.setExit("east", f3_E2);

        f3_E2.setExit("west", f3_D2);
        f3_E2.setExit("north", f3_E3);

        f3_F2.setExit("north", f3_F3);
        f3_F2.setExit("south", f3_F1);

        // Lag 3
        f3_A3.setExit("south", f3_A2);
        f3_A3.setExit("north", f3_A4);

        f3_B3.setExit("north", f3_B4);
        f3_B3.setExit("south", f3_B2);

        f3_C3.setExit("north", f3_C4);
        f3_C3.setExit("south", f3_C2);

        f3_D3.setExit("east", f3_E3);

        f3_E3.setExit("east", f3_F3);
        f3_E3.setExit("west", f3_D3);
        f3_E3.setExit("north", f3_E4);
        f3_E3.setExit("south", f3_E2);

        f3_F3.setExit("west", f3_E3);
        f3_F3.setExit("south", f3_F2);

        // Lag 4
        f3_A4.setExitWithColor("north", f3_A5, "green");
        f3_A4.setExit("south", f3_A3);
        f3_A4.setExit("east", f3_B4);

        f3_B4.setExit("west", f3_A4);
        f3_B4.setExit("north", f3_B5);
        f3_B4.setExit("east", f3_C4);

        f3_C4.setExit("south", f3_C3);
        f3_C4.setExit("east", f3_D4);

        f3_D4.setExit("west", f3_C4);
        f3_D4.setExit("east", f3_E4);

        f3_E4.setExit("north", f3_E5);
        f3_E4.setExit("west", f3_D4);
        f3_E4.setExitWithColor("south", f3_E3,"gasmask");

        f3_F4.setExit("north", f3_F5);

        // Lag 5
        f3_A5.setExit("south", f3_A4);

        f3_B5.setExit("south", f3_B4);
        f3_B5.setExit("east", f3_C5);

        f3_C5.setExit("west", f3_B5);
        f3_C5.setExit("north", f3_C6);
        f3_C5.setExit("east", f3_D5);

        f3_D5.setExit("west", f3_C5);
        f3_D5.setExit("north", f3_D6);
        f3_D5.setExit("east", f3_E5);

        f3_E5.setExitWithColor("north", f3_E6, "red");
        f3_E5.setExit("south", f3_E4);
        f3_E5.setExit("west", f3_D5);
        f3_E5.setExit("east", f3_F5);

        f3_F5.setExit("west", f3_E5);
        f3_F5.setExit("north", f3_F6);
        f3_F5.setExit("south", f3_F4);

        // Lag 6
        f3_A6.setExitWithColor("north", f3_A7, "blue");
        f3_A6.setExit("east", f3_B6);

        f3_B6.setExit("west", f3_A6);
        f3_B6.setExit("north", f3_B7);

        f3_C6.setExit("south", f3_C5);
        f3_C6.setExit("north", f3_C7);

        f3_D6.setExitWithColor("north", f3_D7, "whip");
        f3_D6.setExit("south", f3_D5);

        f3_E6.setExit("south", f3_E5);

        f3_F6.setExit("north", f3_F7);
        f3_F6.setExit("south", f3_F5);

        // Lag 7
        f3_A7.setExit("south", f3_A6);

        f3_B7.setExit("south", f3_B6);
        f3_B7.setExit("east", f3_C7);

        f3_C7.setExit("west", f3_B7);
        f3_C7.setExit("south", f3_C6);
        f3_C7.setExit("east", f3_D7);

        f3_D7.setExit("west", f3_C7);
        f3_D7.setExitWithColor("south", f3_D6,"whip");
        f3_D7.setExit("north", endRoom);
        f3_D7.setExit("east", f3_E7);

        f3_E7.setExit("west", f3_D7);
        f3_E7.setExit("east", f3_F7);

        f3_F7.setExit("south", f3_F6);
        f3_F7.setExit("west", f3_E7);

        endRoom.setExit("south", f3_D7);

        currentRoom = f3_D7;

        // Anbringer et item i et rum
        f1_C1.setKey(new Key("whip", "Inventory/WhipUpscaled.png","whip"));
        f2_D4.setKey(new Key("gasmask", "Inventory/GasMaskUpscaled.png","gasmask"));
        f2_A4.setItem(new Item("torch", "Inventory/TorchUpscaled.png"));
        f3_D3.setItem(new Item("pistol", "Inventory/GunUpscaled.png"));
        f3_F4.setItem(new Item("hat", "Inventory/HatUpscaled.png"));
        //f3_A7.setItem(new Item("MythicalTreasure","Inventory/MythicalTreasureUpscaled.png",))
        endRoom.setItem(new Item("statue", "Inventory/statueUpscaled.png"));

        // Anbringer en key i et rum
        f3_D2.setKey(new Key("red_key", "Inventory/RedKeyUpscaled.png","red"));
        f3_A5.setKey(new Key("blue_key", "Inventory/BlueKeyUpscaled.png","blue"));
        f3_F7.setKey(new Key("green_key", "Inventory/GreenKeyUpscaled.png","green"));

        // Anbringer alm bonusser i rum
        f1_A2.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f2_D2.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f3_A2.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f3_C4.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f3_A6.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f3_C7.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));
        f3_E3.setItem(new Bonus("bonus1", "Bonus/CoinsUpscaled.png", 1));

        //Anbringer store bonusser i rum
        f1_A3.setItem(new Bonus("bonus2", "Bonus/AmuletUpscaled.png", 2));
        f2_D5.setItem(new Bonus("bonus2", "Bonus/AmuletUpscaled.png", 2));
        f3_F2.setItem(new Bonus("bonus2", "Bonus/AmuletUpscaled.png", 2));
        f3_E6.setItem(new Bonus("bonus2", "Bonus/AmuletUpscaled.png", 2));

        //Anbringer spørgsmål i rum og låser døre
        f1_B2.setQuestion(0);
        f1_B2.findDoor("east").lock();

        //
    }

    public static Room getCurrentRoom() {
        return currentRoom;
    }

    public static void setCurrentRoom(Room currentRoom) {
        Rooms.currentRoom = currentRoom;
    }

    public static Room getEndRoom() {
        return endRoom;
    }
    
    
    public static void incrementRoomCounter ()  {
        roomCounter += 1;
    }
    
    public static int getRoomCounter () {
        return roomCounter;
    }
    
    public static String findDoorColor(String direction){
        for (int i = 0; i < getCurrentRoom().doors.size(); i++) {
            if (getCurrentRoom().doors.get(i).getDirection().equals(direction)) {
                if (getCurrentRoom().doors.get(i).getColor()!=null){
                    return getCurrentRoom().doors.get(i).getColor(); 
                } else {
                    return "none";
                }
            }
        }
        return "none";
    }

}
