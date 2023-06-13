import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venusaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venusaur extends Ivysaur
{
    /**
     * Act - do whatever the Venusaur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
      setSize();
    }
    public void setSize(){
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }
}
