import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalWin extends World
{

    /**
     * Constructor for objects of class FinalWin.
     * 
     */
    public FinalWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //this is to tell player what to do inorder to enter the gym
        getBackground().drawImage(new GreenfootImage("YOU WIN  ", 20, null, null), 270, 200);
        getBackground().drawImage(new GreenfootImage("PRESS E TO CONTINUE", 20, null, null), 210, 240);
        getBackground().drawImage(new GreenfootImage("HERES YOUR HEAT BADGE, THANK YOU FOR PLAYING ", 20, null, null), 120, 220);
        displayPoke();
        addObject( new FlameBadge(),299,333);
        
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
