/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain;

/**
 *
 * @author morte
 */
public class Key extends Item{
    
    private String color;
    
    public Key (String description, String color){
        super(description);
        this.color = color;
    }
    
    //Returner farve på en nøgle
    public String getColor () { 
        return color;
    }
    
    
    //Bliver ikke brugt endnu, men bruges evt til at ændre farve på en nøgle
    public void changeColor (String newColor){
        color = newColor;
    }
}
