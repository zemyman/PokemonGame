import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestToSpawnWarp extends Actor
{
    public void act()
    {
        GreenfootImage img = new GreenfootImage(65, 20);
        img.setColor(new Color(255,0,0));
        img.fill();
        setImage(img);
        if(isTouching(Player.class)){
            spawn w = new spawn();
            Greenfoot.setWorld(w);
            
        }
    }
}
