/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.objects;

import worldofzuul.domain.objects.Item;

/**
 *
 * @author Rene_
 */
public class Bonus extends Item{
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
