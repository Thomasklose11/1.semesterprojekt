package worldofzuul.domain.rooms;

import worldofzuul.domain.challenges.Highscore;
import worldofzuul.domain.objects.Score;
import worldofzuul.domain.rooms.Rooms;

public class End {

    public static boolean endTrue = false;

    public static void end() {
        if (Rooms.getCurrentRoom() == Rooms.getEndRoom() && Rooms.getEndRoom().hasItems == false) {
            endTrue = true;
            Score.incrementScore(Rooms.getRoomCounter() * 50);
            new Highscore().appendToHighscore();
        }

    }
}
