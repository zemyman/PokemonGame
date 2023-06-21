import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthbarPlayer extends EnemyPokemon
{
    /**
     * Act - do whatever the healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //a simple health bar for Player
        // Add your action code here.
         GreenfootImage full = new GreenfootImage("healthbar_green.png");
         GreenfootImage aboveHalf = new GreenfootImage("healthbar_yellow.png");
         GreenfootImage Half = new GreenfootImage("healthbar_orange.png");
         GreenfootImage low = new GreenfootImage("healthbar_red.png");
         if(PlayerFight.playerHealth >75){
             setImage(full);
         }
         if(PlayerFight.playerHealth < 75){
             setImage(aboveHalf);
         }
         if(PlayerFight.playerHealth < 50){
             setImage(Half);
         }
          if(PlayerFight.playerHealth < 25){
             setImage(low);
         }
         
         
    }
}
