import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlastoiseFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlastoiseFight extends Blastoise
{
    public int x;
    /**
     * Act - do whatever the BlastoiseFight wants to do. This method is called whenever
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
         GreenfootImage s7 = new GreenfootImage("blastoiseFight.png");
         GreenfootImage B = new GreenfootImage("blastoiseFight.png");
         GreenfootImage[] images = {s1,s2, s3, s4,s5,s6,s7,B};
         //This is for when throwBall touches Blastoise it goes through its animation 
         //and then gets rid of the ball
         if(isTouching(ThrowBall.class)){
         do{
             
             setImage(images[x]);
             x++;
             Greenfoot.delay(4);
             if(x == 7){
              getWorld().removeObjects(getWorld().getObjects(ThrowBall.class));
             }
         }while(x < 7);
    }
    setSize();
    }
    public void setSize(){
        GreenfootImage image = getImage();  
        image.scale(70,70);
        setImage(image);
    }
}
