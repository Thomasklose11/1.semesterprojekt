package worldofzull.domain;

/**
 *
 * @author Rene_
 */
public class Rooms {

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
        startRoom = new Room("You’re in the jungle in Belize.\n"
                + "You, the Archeologist “El Whipper”, has through 16 years of devoted research, looked for ancient Mayan\n"
                + "treasures. You now stand before the possibly greatest treasure to ever see the light of day. Will you\n"
                + "succeed in finding the treasure or will you succumb to the dangers of the temple. It is up to you!");

        f1_A1 = new Room("You’re standing in a dark room.");
        f1_B1 = new Room("The door to the outside is sealed shut.\n"
                + "A statue is standing in the middle of the room, it’s eyes starts to glow and it utters: “This ancient temple\n"
                + "contains many secret treasures, but dangers lurk within, many have tried, but none have succeeded in\n"
                + "obtaining the legendary jade statue”");
        f1_C1 = new Room("You spot on the floor, a whip lying in the dust.");

        f1_A2 = new Room("On the floor you spot a treasure.");
        f1_B2 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f1_C2 = new Room("You enter the room and spot a large shadow out of the corner of your eye, before you can get a good look\n"
                + "at it, it disappears.");

        f1_A3 = new Room("On the floor you spot a valuable treasure and pick it up");
        f1_B3 = new Room("You stand in front of a pit and see a large branch above it, it is out of your reach, but it looks stable and\n"
                + "solid.");
        f1_C3 = new Room("You stand in an empty room.");

        //Second floor rooms
        f2_A1 = new Room("You stand in an empty room.");
        f2_B1 = new Room("You have reached a checkpoint and have ventured deeper in the temple");
        f2_C1 = new Room("You’re standing in a dark room.");

        f2_A2 = new Room("You see a lever high up on the wall, it is out of your reach");
        f2_B2 = new Room("As you enter the room the wall begins to close in and a riddle is presented to you, solve it in time or be\n"
                + "crushed (WIP)");
        f2_C2 = new Room("You stand in an empty room.");
        f2_D2 = new Room("On the floor you spot a treasure and pick it up");

        f2_A3 = new Room("You’re standing in a dark room.");
        f2_B3 = new Room("You stand in an empty room.");
        f2_C3 = new Room("The doors around you are locked, answer this puzzle correct to continue through.");
        f2_D3 = new Room("You see a button on the other side of a large gap, it is out of your reach .");

        f2_A4 = new Room("You see a torch hanging on the wall, do you want to pick it up?");
        f2_B4 = new Room("You stand in an empty room.");
        f2_C4 = new Room("Enemy room (WIP)");
        f2_D4 = new Room("You spot a gas mask on the corpse of a dead Nazi soldier.");

        f2_A5 = new Room("The only way forward is down through the hole in the floor, you see a branch sturdy enough to hold your weight.");
        f2_B5 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f2_C5 = new Room("You smell gas coming from the door to the east");
        f2_D5 = new Room("The room is full of gas. Fortunately you have your gas mask on, and you find a valuable treasure on the ground");

        //Third floor rooms
        f3_A1 = new Room("You stand in a dark room");
        f3_B1 = new Room("You have reached a checkpoint and have ventured deeper in the temple");
        f3_C1 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f3_D1 = new Room("You are presented with a riddle, answer it to move on.");
        f3_E1 = new Room("You have reached a checkpoint. \n"
                + "In the same room you spot an inscription on the wall which you translate to: “A choice must be made, head west to help yourself down the line, or east if you are up for a rewarding challenge”.");
        f3_F1 = new Room("A room with an enemy (WIP)");

        f3_A2 = new Room("On the floor you spot a treasure and pick it up");
        f3_B2 = new Room("You stand in an empty room");
        f3_C2 = new Room("You’re stuck in a room, and have to answer this riddle to move on.");
        f3_D2 = new Room("You spot a green key, hanging on a tiny hook on the wall.");
        f3_E2 = new Room("Trapped room (WIP)");
        f3_F2 = new Room("On the floor you spot a valuable treasure and pick it up.");

        f3_A3 = new Room("You stand in a dark room");
        f3_B3 = new Room("Trapped room (WIP)");
        f3_C3 = new Room("Enemy room (WIP)");
        f3_D3 = new Room("You see a pair of guns lying on the floor, you’re also forced to solve a riddle to continue.");
        f3_E3 = new Room("On the floor you spot a treasure and pick it up");
        f3_F3 = new Room("A large lever is in the room, pulling it may open the shut door to the west");

        f3_A4 = new Room("The door in front of you is locked, answer this puzzle correct to continue through.");
        f3_B4 = new Room("Hint (WIP)");
        f3_C4 = new Room("On the floor you spot a treasure and pick it up");
        f3_D4 = new Room("Health+ (WIP)");
        f3_E4 = new Room("Health+ (WIP)");
        f3_F4 = new Room("Indy's hat  (WIP)");

        f3_A5 = new Room("You find a blue key(WIP)");
        f3_B5 = new Room("Health+ (WIP)");
        f3_C5 = new Room("You stand in an empty room ");
        f3_D5 = new Room("Enemy (WIP)");
        f3_E5 = new Room("You stand in an empty room ");
        f3_F5 = new Room("You’re stuck in a room, and have to answer this riddle to move on.");

        f3_A6 = new Room("On the floor you spot a treasure and pick it up");
        f3_B6 = new Room("Enemy(WIP)");
        f3_C6 = new Room("Trap (WIP)");
        f3_D6 = new Room("El pisko(WIP)");
        f3_E6 = new Room("Bonus+ Health+  (WIP)");
        f3_F6 = new Room("You stand in an empty room ");

        f3_A7 = new Room("Giant bonus treasure super room+++ (WIP)");
        f3_B7 = new Room("You stand in an empty room ");
        f3_C7 = new Room("On the floor you spot a treasure and pick it up");
        f3_D7 = new Room("You stand in front of a huge door. You need a password to open the door");
        f3_E7 = new Room("Trap room (WIP)");
        f3_F7 = new Room("You find a green key");

        endRoom = new Room("Last room + Jade statue");

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
        f1_B3.setExit("north", f2_B1);
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

        f2_A2.setExit("north", f2_A3);
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
        f2_A3.setExit("south", f2_A2);

        f2_B3.setExit("west", f2_A3);
        f2_B3.setExit("south", f2_B2);
        f2_B3.setExit("east", f2_C3);

        f2_C3.setExit("north", f2_C4);
        f2_C3.setExit("south", f2_C2);
        f2_C3.setExit("east", f2_D3);
        f2_C3.setExit("west", f2_B3);

        f2_D3.setExit("west", f2_C3);
        f2_D3.setExit("south", f2_D2);

        f2_A4.setExit("south", f2_A3);

        f2_B4.setExit("east", f2_C4);

        f2_C4.setExit("north", f2_C5);
        f2_C4.setExit("south", f2_C3);
        f2_C4.setExit("east", f2_D4);
        f2_C4.setExit("west", f2_B4);

        f2_D4.setExit("west", f2_C4);

        f2_A5.setExit("north", f3_B1);
        f2_A5.setExit("east", f2_B5);

        f2_B5.setExit("east", f2_C5);
        f2_B5.setExit("west", f2_A5);

        f2_C5.setExit("south", f2_C4);
        f2_C5.setExit("east", f2_D5);
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
        f3_B1.setExit("south", f2_A5);

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
        f3_A4.setExit("north", f3_A5);
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
        f3_E4.setExit("south", f3_E3);

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

        f3_E5.setExit("north", f3_E6);
        f3_E5.setExit("south", f3_E4);
        f3_E5.setExit("west", f3_D5);
        f3_E5.setExit("east", f3_F5);

        f3_F5.setExit("west", f3_E5);
        f3_F5.setExit("north", f3_F6);
        f3_F5.setExit("south", f3_F4);

        // Lag 6
        f3_A6.setExit("north", f3_A7);
        f3_A6.setExit("east", f3_B6);

        f3_B6.setExit("west", f3_A6);
        f3_B6.setExit("north", f3_B7);

        f3_C6.setExit("south", f3_C5);
        f3_C6.setExit("north", f3_C7);

        f3_D6.setExit("north", f3_D7);
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
        f3_D7.setExit("south", f3_D6);
        f3_D7.setExit("north", endRoom);
        f3_D7.setExit("east", f3_E7);

        f3_E7.setExit("west", f3_D7);
        f3_E7.setExit("east", f3_F7);

        f3_F7.setExit("south", f3_F6);
        f3_F7.setExit("west", f3_E7);

        endRoom.setExit("south", f3_D7);

        currentRoom = startRoom;


        // Anbringer et item i et rum
        f1_C1.setItem(new Item("whip"));
        f2_D4.setItem(new Item("gasmask"));
        f2_A4.setItem(new Item("torch"));
        f3_D3.setItem(new Item("pistol"));
        f3_D2.setItem(new Item("redkey"));
        f3_F4.setItem(new Item("hat"));
        f3_A5.setItem(new Item("bluekey"));
        f3_F7.setItem(new Item("greenkey"));
        endRoom.setItem(new Item("statue"));
    
        // Anbringer bonusser i rum
        f1_A2.setBonus1();
        f2_D2.setBonus1();
        f3_A2.setBonus1();
        f3_C4.setBonus1();
        f3_A6.setBonus1();
        f3_C7.setBonus1();
        f3_E3.setBonus1();
        
        //Anbringer store bonusser i rum
        f1_A3.setBonus2();
        f2_D5.setBonus2();
        f3_F2.setBonus2();
        f3_E6.setBonus2();
        
        //Anbringer spørgsmål i rum og låser døre
        f1_B2.setQuestion(0);
        f1_B2.findDoor("east").lock();
    }

    public static Room getCurrentRoom() {
        return currentRoom;
    }

    public static void setCurrentRoom(Room currentRoom) {
        Rooms.currentRoom = currentRoom;
    }
    
    public static Room getEndRoom(){
        return endRoom;
    }

}
