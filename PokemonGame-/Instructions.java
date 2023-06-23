import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Screens
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        //this is to tell player what to do inorder to enter the gym
        
    }
    public void writeobject(){
         getBackground().drawImage(new GreenfootImage("YOU ARE NOT STRONG ENOUGH! ", 20, null, null), 180, 200);
        getBackground().drawImage(new GreenfootImage("PRESS E TO CONTINUE", 20, null, null), 210, 240);
        getBackground().drawImage(new GreenfootImage("TRAIN YOU'RE POKEMON IN THE FOREST!", 20, null, null), 160, 220);
        
        addObject(new Tp2(),589,7);
    }
}
