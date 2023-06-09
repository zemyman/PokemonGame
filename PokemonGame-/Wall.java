import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoundsCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the BoundsCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wall(int width, int height){
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(new Color(0,0,0));
        img.fill();
        setImage(img);
    }
}
