import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class forestWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnToForestWarp extends Actor
{
    public SpawnToForestWarp(){
        GreenfootImage img = new GreenfootImage(65, 20);
        img.setColor(new Color(200,0,0));
        img.fill();
        setImage(img);
    }
    public void act()
    {
        if(isTouching(Player.class)){
            Forest w = new Forest();
            Greenfoot.setWorld(w);
            
        }
    }
}
