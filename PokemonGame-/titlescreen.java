import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends Actor
{
    public int x;
    /**
     * Act - do whatever the titlescreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage t1 = new GreenfootImage("T1.gif");
        GreenfootImage t2 = new GreenfootImage("T2.gif");
        GreenfootImage t3 = new GreenfootImage("T3.gif");
        GreenfootImage t4 = new GreenfootImage("T4.gif");
        GreenfootImage t5 = new GreenfootImage("T5.gif");
        GreenfootImage t6 = new GreenfootImage("T6.gif");
        GreenfootImage t7 = new GreenfootImage("T7.gif");
        GreenfootImage t8 = new GreenfootImage("T8.gif");
        GreenfootImage t9 = new GreenfootImage("T9.gif");
        GreenfootImage t10 = new GreenfootImage("T10.gif");
        GreenfootImage t11 = new GreenfootImage("T11.gif");
        GreenfootImage t12 = new GreenfootImage("T12.gif");
        GreenfootImage t13 = new GreenfootImage("T13.gif");
        GreenfootImage t14 = new GreenfootImage("T14.gif");
        GreenfootImage t15 = new GreenfootImage("T15.gif");
        GreenfootImage t16 = new GreenfootImage("T16.gif");
        GreenfootImage t17 = new GreenfootImage("T17.gif");
        GreenfootImage t18 = new GreenfootImage("T18.gif");
        GreenfootImage t19 = new GreenfootImage("T19.gif");
        GreenfootImage t20 = new GreenfootImage("T20.gif");
        GreenfootImage t21 = new GreenfootImage("T21.gif");
        GreenfootImage t22 = new GreenfootImage("T22.gif");
        GreenfootImage t23 = new GreenfootImage("T23.gif");
        GreenfootImage t24 = new GreenfootImage("T24.gif");
        GreenfootImage t25 = new GreenfootImage("T25.gif");
        GreenfootImage[] images = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25};
        
        do{
            
            setImage(images[x]);
            GreenfootImage image = getImage();
             image.scale(600, 380);
             Greenfoot.delay(4);
             
             
             x++;
             if(x==23){
                 x = 11;
             }
             if(Greenfoot.isKeyDown("e") == true) {
                 Start w = new Start();
                 Greenfoot.setWorld(w);
                 x = 40;
             }
        }while(x < 24);
    }
}
