import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ivysaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ivysaur extends Bulbasur
{
    /**
     * Act - do whatever the Ivysaur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
      setSize();
    }
    //method for seting the size of the actor
    public void setSize(){
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }
}
