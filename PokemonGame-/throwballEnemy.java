import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class throwballEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class throwballEnemy extends Actor
{
   
    GreenfootImage blank = new GreenfootImage("blank.png");
    GreenfootImage ball = new GreenfootImage("ball.png");
    public static int dele;
    /**
     * Act - do whatever the throwballEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  void act()
    {
        
        setImage(blank);
        if(isTouching(finalGymEnemy.class)){
            setImage(ball);
            setLocation(getX()-1,getY()+1);
    }
    
    
    
   }
   
}
