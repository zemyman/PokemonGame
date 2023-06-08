import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharmanderFight2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharmanderFight2 extends Charmander
{
    /**
     * Act - do whatever the CharmanderFight2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
            if(getX() < 376){
        setLocation(getX() + 1, getY());
        
    }
    }
}
