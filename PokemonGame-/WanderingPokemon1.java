import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WanderingPokemon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WanderingPokemon1 extends Actor
{
    public static int x;
    /**
     * Act - do whatever the WanderingPokemon1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
        if(isTouching(Player.class) && x == 1){
            
            whenTuched();
                
            
        }
        getImage().setTransparency(0);
    }
    public void changeWorld(){
        Battle w = new Battle();
        Greenfoot.setWorld(w);
        getImage().setTransparency(0);
    }
    public void whenTuched(){
        changeWorld();
    }
}
