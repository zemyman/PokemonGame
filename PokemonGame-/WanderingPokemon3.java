import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WanderingPokemon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WanderingPokemon3 extends Actor
{
    public static int x;
    /**
     * Act - do whatever the WanderingPokemon3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Battle w = new Battle();
        
        if(isTouching(Player.class) && x == 3){
            
            
                Greenfoot.setWorld(w);
            
        }
    }
}