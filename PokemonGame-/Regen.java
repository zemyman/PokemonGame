import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class regen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regen extends Actor
{
    /**
     * Act - do whatever the regen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(PlayerFight.playerHealth < 100){
        if(Greenfoot.isKeyDown("l")){
            PlayerFight.playerHealth++;
        }
    }
    getImage().setTransparency(0);
}
}
