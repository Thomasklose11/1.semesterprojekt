package worldofzuul.domain.objects;

import javafx.scene.image.Image;

/**
 *
 * @author Rene_
 */
public class Item {

    private Image icon;
    private String description;

    //constructor
    public Item(String newDescription) {
        description = newDescription;
    }

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
