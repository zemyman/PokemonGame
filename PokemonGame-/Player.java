import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int deltaX ;
    public int deltaY;
    public int speed = 1;
    
    public void act(){
    
        //Images
         GreenfootImage west = new GreenfootImage("PlayerW.png");
         GreenfootImage north = new GreenfootImage("PlayerB.png");
         GreenfootImage east = new GreenfootImage("PlayerE.png");
         GreenfootImage south = new GreenfootImage("PlayerS.png");
       //Movement
      
    
}
    public static void whatS(int start){
        
        spawn.pokemonDisplay(start);
        Forest.pokemonDisplay(start);
        Battle.pokemon1U(start);
        PlayerFight.pokemon1U(start);
        
    }
}
    
 

