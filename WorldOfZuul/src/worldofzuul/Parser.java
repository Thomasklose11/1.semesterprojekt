package worldofzuul;

import java.util.Scanner;

public class Parser 
{
    private static CommandWords commands;
    private static Scanner reader;

    public static void init() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public static Command getCommand() 
    {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> "); 

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next(); 
            }
        }

        return new Command(commands.getCommandWord(word1), word2);
    }

    public static void showCommands()
    {
        commands.showAll();
    }
}
