/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author morte
 */
public class Door {

    private boolean locked = false;
    private boolean blocked = false;
    private String direction;

    public Door(String direction) {
        this.direction = direction;
    }

    public void unlock() {
        locked = false;
    }

    public void lock() {
        locked = true;
    }

    public void switchLock() {
        if (locked == true) {
            locked = false;
        } else {
            locked = true;
        }
    }

    public boolean getLocked() {
        return locked;
    }

    public String getDirection() {
        return direction;
    }
}
