import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulbasurFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulbasurFight extends Bulbasur
{
    public int x;
    public int hp;
    public int atck;
    public int xp;
    /**
     * Act - do whatever the BulbasurFight wants to do. This method is called whenever
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
         GreenfootImage s7 = new GreenfootImage("B.png");
         GreenfootImage B = new GreenfootImage("B.png");
         GreenfootImage[] images = {s1,s2, s3, s4,s5,s6,s7,B};
         
         if(Greenfoot.isKeyDown("1") ){
             
         }
         
         if(Greenfoot.isKeyDown("2") ){
             
         }
         
         if(Greenfoot.isKeyDown("3") ){
             
         }
         
         if(Greenfoot.isKeyDown("4") ){
             
         }
         
         if(isTouching(throwBall.class)){
         do{
             
             setImage(images[x]);
             x++;
             Greenfoot.delay(4);
             if(x == 7){
              getWorld().removeObjects(getWorld().getObjects(throwBall.class));
             }
         }while(x < 7);
    }
    
    }
}
