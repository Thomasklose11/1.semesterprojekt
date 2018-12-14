package worldofzuul.domain.objects;

public class Key extends Item {

    private String color;

    public Key(String description, String URL, String color) {
        super(description, URL);
        this.color = color;
    }

    //Returns the color of the key

    public String getColor() {
        return color;
    }

}
