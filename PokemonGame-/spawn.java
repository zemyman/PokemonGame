import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spawn extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public spawn()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(631, 316, 1, false); 
        //Greenfoot.setWorld(new topOfMap());
        
        //ADDING PLAYER
        addObject(new Player(),500, 163);
        //BOUNDS
        addObject(new Bounds(),378, 288);
        addObject(new BoundsSide(),524, 141);
        addObject(new Bounds(),274, 228);
        addObject(new BoundsSide(),127, 135);
        addObject(new Bounds(),242, 30);
        addObject(new smallVBound(),389, 4);
        addObject(new smallVBound(),451, 256);
        addObject(new smallVBound(),451, 198);
        addObject(new smallVBound(),420, 200);
        addObject(new SmallHbounds(),434,170);
        //Waprs
        addObject(new forestWarp(),486,259);
        
    }
}
