import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WanderingPokemon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WanderingPokemon1 extends Actor
{
    /**
     * Act - do whatever the WanderingPokemon1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Battle w = new Battle();
        int x = Greenfoot.getRandomNumber(10);
        if(isTouching(Player.class)){
            
            if( x <= 3 ){
                Greenfoot.setWorld(w);
            }
        }
    }
}
