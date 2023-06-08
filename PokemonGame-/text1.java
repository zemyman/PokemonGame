import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class text1 extends Actor
{
    /**
     * Act - do whatever the text1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        spawn w = new spawn();
        if(Greenfoot.isKeyDown("1") ){
            Player.whatS(1);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
        }
        else if(Greenfoot.isKeyDown("2")){
            Player.whatS(2);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
        }
        else if(Greenfoot.isKeyDown("3") ){
            Player.whatS(3);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
        }
    }
}
