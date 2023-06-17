import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalGymEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalGymEnemy extends EnemyPokemon
{
    public int x;
    /**
     * Act - do whatever the finalGymEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = getImage();
            image.scale(100, 100);
  
      move();
        }
    public void move(){
        if(getX() < 451){
        setLocation(getX()  + 4 , getY());
        
       }
    }
}
