import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WanderingPokemon2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WanderingPokemon2 extends Actor
{
    public static int x;
    /**
     * Act - do whatever the WanderingPokemon2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Battle w = new Battle();
        
        if(isTouching(Player.class) && x == 2){
            
            
                Greenfoot.setWorld(w);
            
        }
    }
}
