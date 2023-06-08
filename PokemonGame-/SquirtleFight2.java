import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SquirtleFight2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SquirtleFight2 extends SquirltleFight
{
    /**
     * Act - do whatever the SquirtleFight2 wants to do. This method is called whenever
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
