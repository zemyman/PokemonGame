import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class forestWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestWarp extends Actor{
    /**
     * Act - do whatever the forestWarp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class)){
            Forest w = new Forest();
            Greenfoot.setWorld(w);
            
        }
        getImage().setTransparency(0);
    }
}
