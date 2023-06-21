import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class throwBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class throwBall extends Actor
{
   
    GreenfootImage blank = new GreenfootImage("blank.png");
    GreenfootImage ball = new GreenfootImage("ball.png");
    public static int dele;
    /**
     * Act - do whatever the throwBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  void act()
    {
        
        setImage(blank);
        if(isTouching(PlayerFight.class)){
            setImage(ball);
            setLocation(getX()+1,getY()-1);
    }
    
    
    
   }
   
}