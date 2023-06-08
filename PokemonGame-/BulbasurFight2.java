import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulbasurFight2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulbasurFight2 extends Bulbasur
{
    /**
     * Act - do whatever the BulbasurFight2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getX() < 376){
        setLocation(getX() + 1, getY());
        
    }
}
}
