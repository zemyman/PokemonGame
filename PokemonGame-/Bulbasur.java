import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasur extends Actor
{
    /**
     * Act - do whatever the Bulbasur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void setSize(int x, int y){
        GreenfootImage image = getImage();  
        image.scale(x, y);
        setImage(image);
    }
}
