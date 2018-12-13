package worldofzuul.domain.objects;

public class Key extends Item {

    private String color;

    public Key(String description, String URL, String color) {
        super(description, URL);
        this.color = color;
    }

    //Returner farve på en nøgle
    public String getColor() {
        return color;
    }

    //Bliver ikke brugt endnu, men bruges evt til at ændre farve på en nøgle
    public void changeColor(String newColor) {
        color = newColor;
    }
}
