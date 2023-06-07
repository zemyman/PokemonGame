import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{

    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 400, 1, false); 
        //Adding player
        addObject(new Player(),216, 8);
        //adding bounds
        addObject(new BoundsSide(),259, 390);
        
        addObject(new smallVBound(),198, 88);
        addObject(new smallVBound(),202, 143);
        addObject(new smallVBound(),233, 133);
        addObject(new smallVBound(),153, 177);
        addObject(new smallVBound(),137, 214);
        addObject(new smallVBound(),91, 272);
        addObject(new smallVBound(),91, 328);
        addObject(new smallVBound(),162, 331);
        
        addObject(new SmallHbounds(),168, 58);
        addObject(new SmallHbounds(),207, 102);
        addObject(new SmallHbounds(),205, 119);
        addObject(new SmallHbounds(),206, 157);
        addObject(new SmallHbounds(),175, 172);
        addObject(new SmallHbounds(),125, 205);
        addObject(new SmallHbounds(),111, 240);
        addObject(new SmallHbounds(),81, 357);
        
        addObject(new smallVBound(),216, 327);
        addObject(new smallVBound(),216, 372);
        addObject(new smallVBound(),258, 393);
        addObject(new smallVBound(),415, 216);
        addObject(new smallVBound(),414, 168);
        addObject(new smallVBound(),358, 166);
        addObject(new smallVBound(),281, 166);
        addObject(new smallVBound(),281, 58);
        addObject(new smallVBound(),281, 114);
        
        addObject(new SmallHbounds(),134, 357);
        addObject(new SmallHbounds(),187, 300);
        addObject(new SmallHbounds(),286, 241);
        addObject(new SmallHbounds(),344, 242);
        addObject(new SmallHbounds(),387, 242);
        addObject(new SmallHbounds(),386, 142);
        addObject(new SmallHbounds(),331, 192);
        addObject(new SmallHbounds(),307, 192);
        //warps
        addObject(new SpawnWarp(),236, 376);
    }
}
