import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blastoise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blastoise extends Wartortle
{
    /**
     * Act - do whatever the Blastoise wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
      setSize();
    }public void setSize(){
        GreenfootImage image = getImage();  
        image.scale(55, 50);
        setImage(image);
    }
}
