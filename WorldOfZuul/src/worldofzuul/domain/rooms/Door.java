package worldofzuul.domain.rooms;

public class Door {
//Creates doors and add the ability to lock and unlock them and to add color
    private boolean locked = false;
    private final String direction;

    private String color = null;

    //Laver en dør
    public Door(String direction) {
        this.direction = direction;
    }

    //Laver en dør med en bestemt farve som er låst
    public Door(String direction, String color) {
        this.direction = direction;
        this.color = color;
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void lock() {
        locked = true;
    }

    public boolean getLocked() {
        return locked;
    }

    public String getDirection() {
        return direction;
    }

    public String getColor() {
        return color;
    }
}
