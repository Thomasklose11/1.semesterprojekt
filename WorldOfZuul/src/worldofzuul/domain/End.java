package worldofzuul.domain;

public class End {

    public static boolean endTrue = false;

    public static void end() {
        if (Rooms.getCurrentRoom() == Rooms.getEndRoom() && Rooms.getEndRoom().hasItems == false) {
            endTrue = true;
            Score.incrementScore(Rooms.getRoomCounter() * 50);
            Highscore.scorenm();
        }

    }
}
