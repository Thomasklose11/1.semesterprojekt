package worldofzuul.domain.objects;

import javafx.scene.image.Image;

public class Item {

    private Image icon;
    private String description;

    // This constructor contains two objects, a String description and a String imageURL.
    // The imageURL adds a image to the item 
    public Item(String description, String imageURL) {
        this.description = description;
        icon = new Image(imageURL, true);
    }

    public Image getIcon() {
        return this.icon;
    }

    public String getDescription() {
        return description;
    }
}
