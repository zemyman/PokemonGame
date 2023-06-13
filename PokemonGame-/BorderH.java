import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BorderH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BorderH extends Actor
{
    /**
     * Act - do whatever the BorderH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
public BorderH(int width, int height){
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(new Color(0,0,255));
        img.fill();
        setImage(img);    
        }
    }