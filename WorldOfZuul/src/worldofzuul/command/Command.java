package worldofzuul.command;

public class Command
{
    private final CommandWord commandWord;
    private final String secondWord;

    public Command(CommandWord commandWord, String secondWord)
    {
        this.commandWord = commandWord;
        this.secondWord = secondWord;
    }

    public CommandWord getCommandWord()
    {
        return commandWord;
    }

    public String getSecondWord()
    {
        return secondWord;
    }

    public boolean isUnknown()
    {
        return (commandWord == CommandWord.UNKNOWN);
    }

    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}

