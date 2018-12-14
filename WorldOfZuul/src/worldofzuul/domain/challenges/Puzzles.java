package worldofzuul.domain.challenges;

import worldofzuul.domain.rooms.Rooms;

public class Puzzles {
    //Questions to the puzzle rooms 

    private static int answerType = 0;

    private static final String p1 = "Young I am tall, old I am short. I love to glow. Breath is my foe?";//ask the question
    private static final String p1A = "Human";//Wrong answer
    private static final String p1B = "Candle";//Right answer
    private static final String p1C = "Tree";//Wrong answer
    private static final String p1D = "The Sun";//Wrong answer

    private static final String p2 = "What can you reach with your right hand, but not with your left hand?";//ask question
    private static final String p2A = "Your Sword";//Wrong answer
    private static final String p2B = "Your Drink";//Wrong answer
    private static final String p2C = "Your Left Elbow";//Right answer
    private static final String p2D = "Your Dreams";//Wrong answer

    private static final String p3 = "I am so simple that I only point; yet I guide men all over the world?\n";//ask the question
    private static final String p3A = "A Guide";//Wrong answer
    private static final String p3B = "A Sign";//Wrong answer
    private static final String p3C = "A Compass";//Right answer
    private static final String p3D = "A Friend";//Wrong answer

    private static final String p4 = "What have four legs but doesn't go anywhere?";//ask the question
    private static final String p4A = "A Horse";//Wrong answer
    private static final String p4B = "A Table";//Right answer
    private static final String p4C = "A Tree";//Wrong answer
    private static final String p4D = "A Dog";//Wrong answer

    private static final String p5 = "I have cities, but no houses. I have mountains, but no trees. I have water, but no fish.\n What am I?";//ask the question
    private static final String p5A = "Paradise";//Wrong answer
    private static final String p5B = "A Map";//Right answer
    private static final String p5C = "Armageddon";//Wrong answer
    private static final String p5D = "The World";//Wrong answer

    private static final String p6 = "I'm sometimes full, but I never overflow, I typically show myself when it's dark.\n What Am I?";//ask the question
    private static final String p6A = "The Moon";//Right answer
    private static final String p6B = "A Man";//Wrong answer
    private static final String p6C = "A Glass";//Wrong answer
    private static final String p6D = "A Bat";//Wrong answer

    private static final String p7 = "What devours all, can kill a king, destroy a town and crush a mountain";//ask the question
    private static final String p7A = "Faith";//Wrong answer
    private static final String p7B = "Tsunami";//Wrong answer
    private static final String p7C = "Meteor";//Wrong answer
    private static final String p7D = "Time";//Right answer

    private static final String p8 = "What belongs to you but is used more by others than you?";//ask the question
    private static final String p8A = "Your House";//Wrong answer
    private static final String p8B = "Your Helmet";//Wrong answer
    private static final String p8C = "Your Dog";//Wrong answer
    private static final String p8D = "Your Name";//Right answer

    public static Question[] questions = {
        //Overview over questions and the right answer
        new Question(p1, p1A, p1B, p1C, p1D, "b"),
        new Question(p2, p2A, p2B, p2C, p2D, "c"),
        new Question(p3, p3A, p3B, p3C, p3D, "c"),
        new Question(p4, p4A, p4B, p4C, p4D, "b"),
        new Question(p5, p5A, p5B, p5C, p5D, "b"),
        new Question(p6, p6A, p6B, p6C, p6D, "a"),
        new Question(p7, p7A, p7B, p7C, p7D, "d"),
        new Question(p8, p8A, p8B, p8C, p8D, "d")
    };
//Checks if the answer is correct or incorrect
    public static void answer(String answer, Question question) {
        if (answer.equals(question.getCorrectAnswer())) {
            System.out.println("The answer is correct. The doors are unlocked.");

            Rooms.getCurrentRoom().unlockAll();//Unlocks the door after the question is answer correctly
            Rooms.getCurrentRoom().setQuestionFalse();//Remove the question after it have been ansver correctly
            answerType = 1;

        } else {
            System.out.println("The answer is incorrect. Try again!");
            System.out.println(Rooms.getCurrentRoom().getQuestion().getPrompt());//Asks the question again
            answerType = 2;
        }
    }

    public static int getAnswerType() {
        return answerType;
    }

    public static void setAnswerType(int type) {
        answerType = type;
    }

}
