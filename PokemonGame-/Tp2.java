import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tp2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tp2 extends Actor
{
    /**
     * Act - do whatever the Tp2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("e") ){
            spawn w = new spawn();
            Greenfoot.setWorld(w);
        }
    }
}
