import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pokemoncentersprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pokemoncentersprite extends Actor
{
    /**
     * Act - do whatever the pokemoncentersprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = getImage();
             image.scale(160,160);
    }
}
