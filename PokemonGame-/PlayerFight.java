import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFight extends Actor
{
         GreenfootImage red = new GreenfootImage("ashred.png");
         public static int pokemon1;
       public static void pokemon1U(int poke){
        pokemon1 = poke;
    }
    /**
     * Act - do whatever the PlayerFight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            for(int a = 0; a < 5; a++){
            if(getX()!=84){
            setLocation(getX()  - 1 , getY());
        } if (getX() == 84){
            //Battle.waits(5);
            setLocation(84 , getY());
            setImage(red);
            
            
            //FIRST POKEMON
            if(pokemon1==1){
                
            }
        }
        }
        
        
    }
}
