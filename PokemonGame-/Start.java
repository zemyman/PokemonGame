import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Text1(),272, 138);
        addObject(new PokeballSprite(),175, 247);
        addObject(new PokeballSprite(),294, 247);
        addObject(new PokeballSprite(),427, 247);
        Spawn w = new Spawn("fromElse");
        addObject(new Charmander(),296, 290);
        addObject(new Bulbasur(),176, 290);
        addObject(new Squirtle(),432, 290);
        //choising pokemon
        
    }
}
