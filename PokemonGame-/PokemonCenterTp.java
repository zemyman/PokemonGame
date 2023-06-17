import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PokemonCenterTp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PokemonCenterTp extends Actor
{
    /**
     * Act - do whatever the PokemonCenterTp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(Player.class)){
            PokemonCenter1 w = new PokemonCenter1();
            Greenfoot.setWorld(w);
            
        }
        getImage().setTransparency(0);
    }
}
