import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pokemonCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pokemonCenter extends World
{

    /**
     * Constructor for objects of class pokemonCenter.
     * 
     */
    public pokemonCenter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Bounds(),152, 25);
        addObject(new Bounds(),447, 25);
        addObject(new Bounds(),450, 368);
        addObject(new Bounds(),153, 368);
        addObject(new BoundsSide(),7, 222);
        addObject(new BoundsSide(),7, 156);
        addObject(new BoundsSide(),585, 214);
        addObject(new BoundsSide(),587, 167);
    }
}
