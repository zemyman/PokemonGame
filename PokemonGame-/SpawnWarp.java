import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnWarp extends Actor
{
    /**
     * Act - do whatever the SpawnWarp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //changes world when touching player
        if(isTouching(Player.class)){
            Spawn w = new Spawn();
            Greenfoot.setWorld(w);
            
        }
        getImage().setTransparency(0);
    }
}
