import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseScreen extends Screens

{

    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    public LoseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        //tell the player they lose
        
        
        
    }
    
    public void writeobject(){
        getBackground().drawImage(new GreenfootImage("YOU LOSE!", 20, null, null), 250, 200);
        getBackground().drawImage(new GreenfootImage("PRESS E TO CONTINUE", 20, null, null), 200, 220);
        addObject(new Tp1(),589,7);
    }
}
