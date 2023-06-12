import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BorderV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderV extends Actor
{
    /**
     * Act - do whatever the BorderV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BorderV(int width, int height){
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(new Color(255,0,0));
        img.fill();
        setImage(img);
    }
}
