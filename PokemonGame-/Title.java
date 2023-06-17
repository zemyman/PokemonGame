import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    public static int x= 0;
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new titlescreen(), 300, 180);
        spawn w = new spawn();
        if(Greenfoot.isKeyDown("Enter") ){
            Greenfoot.setWorld(w);
        }
        getBackground().drawImage(new GreenfootImage("PRESS E TO CONTINUE", 20, null, null), 200, 380);

        
    }
}
