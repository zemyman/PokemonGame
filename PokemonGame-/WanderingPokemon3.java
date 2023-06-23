import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WanderingPokemon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WanderingPokemon3 extends WanderingPokemon1
{
    public static int x;
    /**
     * Act - do whatever the WanderingPokemon3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
        if(isTouching(Player.class) && x == 3){
            
            
                whenTuched();
            
        }
        getImage().setTransparency(0);
    }
    
}
