import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().drawImage(new GreenfootImage("YOU WIN!", 20, null, null), 250, 200);
        getBackground().drawImage(new GreenfootImage("PRESS E TO CONTINUE", 20, null, null), 200, 220);
        displayPoke();
        
        addObject(new Tp2(),589,7);
    }
    public void displayPoke(){
        //
        addObject(new Bulbasur(),195,345);
        addObject(new Ivysaur(),121,278);
        addObject(new Venusaur(),57, 340);
        //
        addObject(new Charmander(),403,343);
        addObject(new Charmeleon(),466,287);
        addObject(new Charizard(),542,342);
        //
        addObject(new Squirtle(),288,49);
        addObject(new Wartortle(),212,119);
        addObject(new Blastoise(),369,113);
    }
}
