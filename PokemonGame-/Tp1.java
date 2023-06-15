import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tp1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tp1 extends Actor
{
    /**
     * Act - do whatever the Tp1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("e") ){
            PokemonCenter1 w = new PokemonCenter1();
            Greenfoot.setWorld(w);
        }
    }
}
