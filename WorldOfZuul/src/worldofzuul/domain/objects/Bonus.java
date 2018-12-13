package worldofzuul.domain.objects;

public class Bonus extends Item {

    private int bonus;

    public Bonus(String newDescription) {
        super(newDescription);
    }

    public Bonus(String description, String imageURL, int bonus) {
        super(description, imageURL);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

}
