import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class EnemyPokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyPokemon extends Actor
{
    public static boolean YourTurn1;
    public static int health = 100;
    //random pokemon
    public int x = randP();
    //random attack
    public int randomAttack =0;
    //rand();
    
    /**
     * Act - do whatever the EnemyPokemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        move();
        //images
        GreenfootImage Pikachu = new GreenfootImage("p.png");
        GreenfootImage poly = new GreenfootImage("poly.png");
        GreenfootImage abra = new GreenfootImage("abra.png");
        GreenfootImage bird = new GreenfootImage("bird.png");
        GreenfootImage blank = new GreenfootImage("blank.png");
        
        if(x == 1|| x == 0){
            setImage(Pikachu);
        }
        if(x == 2){
            setImage(poly);
        }
        if(x == 3){
            setImage(abra);
        }
        if(x == 4){
            setImage(bird);
        }
        
        
        
        
    }
    public static void dam(int d){
        health -= d;
    }

    public void move(){
        if(getX() < 357){
        setLocation(getX()  + 4 , getY());
        
       }
    }
    //random attack
    public int rand(){
        int random =  Greenfoot.getRandomNumber(4);
        return random;
    }
    //random pokemon
     public int randP(){
        int random1 =  Greenfoot.getRandomNumber(5);
        return random1;
    }
    //randomDam
    public int randDam(){
        int randomDam = Greenfoot.getRandomNumber(25);
        return randomDam;
    }
   
}
