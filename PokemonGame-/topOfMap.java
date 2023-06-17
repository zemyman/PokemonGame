import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topOfMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class topOfMap extends World
{

    /**
     * Constructor for objects of class topOfMap.
     * 
     */
    public topOfMap()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(631, 309, 1, false); 
        addObject(new Player(),442, 289);
        addObject(new GymWarp(), 166, 157);
    }
}
