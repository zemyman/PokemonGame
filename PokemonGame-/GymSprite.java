import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GymSprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GymSprite extends Actor
{
    /**
     * Act - do whatever the GymSprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = getImage();
             image.scale(60,60);
    }
}
