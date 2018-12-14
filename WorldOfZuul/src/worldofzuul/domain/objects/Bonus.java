package worldofzuul.domain.objects;

public class Bonus extends Item {

    private int bonus;

    // This constructor contains 3 objects, a String description, a String imageURL and a int bonus.
    // The imageURL adds a image to the item    
    // The bonus is used to incraease the score
    public Bonus(String description, String imageURL, int bonus) {
        super(description, imageURL);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

}
