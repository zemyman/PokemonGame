import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topMapWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopMapWarp extends Actor 
{ 
    /**
     * Act - do whatever the topMapWarp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class)){
            TopOfMap w = new TopOfMap();
            Greenfoot.setWorld(w);
            
        }
        getImage().setTransparency(0);
    }
}
