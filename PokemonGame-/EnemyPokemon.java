import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyPokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyPokemon extends Actor
{
    public static boolean YourTurn;
    public static int health;
    public int random;
    /**
     * Act - do whatever the EnemyPokemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        health = 100;
        move();
        if(YourTurn = true){
            if(random == 0){
                
            }
            if(random == 1){
                
            }
            if(random == 2){
                
            }
            if(random == 3){
                
            }
            if(random == 4){
                
            }
            
        }
    }
    public static void attacked(int dam){
        health = health - dam;
    }
    public static void turn(boolean x){
        YourTurn = x;
    }
    public void move(){
        if(getX() <= 357){
        setLocation(getX()  + 4 , getY());
       }
    }
    public int rand(){
        random =  Greenfoot.getRandomNumber(3);
        int randomDam = Greenfoot.getRandomNumber(25);
        return randomDam;
    }
}
