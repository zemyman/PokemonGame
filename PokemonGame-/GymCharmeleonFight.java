import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GymCharmeleonFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GymCharmeleonFight extends Charmeleon
{
    public int x;
    /**
     * Act - do whatever the GymCharmeleonFight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
          GreenfootImage s1 = new GreenfootImage("S1.png");
         GreenfootImage s2 = new GreenfootImage("S2.png");
         GreenfootImage s3 = new GreenfootImage("S3.png");
         GreenfootImage s4 = new GreenfootImage("S4.png");
         GreenfootImage s5 = new GreenfootImage("S5.png");
         GreenfootImage s6 = new GreenfootImage("S6.png");
         GreenfootImage s7 = new GreenfootImage("charmeleonFight.png");
         GreenfootImage B = new GreenfootImage("charmeleonFight.png");
         GreenfootImage[] images = {s1,s2, s3, s4,s5,s6,s7,B,B,B,B};
         //This is for when throwBall touches The Gym Leaders Charmeleon it goes through its animation 
         //and then gets rid of the ball
         if(isTouching(throwballEnemy.class)){
         do{
             x++;
             setImage(images[x]);
             
             Greenfoot.delay(4);
             if(x == 6){
              getWorld().removeObjects(getWorld().getObjects(throwballEnemy.class));
             }
         }while(x < 7);
    }
    setSize();
    }
   
}
