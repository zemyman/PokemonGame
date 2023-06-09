import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pokemonCenterTp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pokemonCenterTp extends Actor
{
    /**
     * Act - do whatever the pokemonCenterTp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(Player.class)){
            PokemonCenter1 w = new PokemonCenter1();
            Greenfoot.setWorld(w);
            
        }
    }
}
