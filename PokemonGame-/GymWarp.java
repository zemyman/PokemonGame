import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GymWarp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GymWarp extends Actor
{
    public static int pokemon1;
    public static void pokemonDisplay(int pokemon){
        pokemon1 = pokemon;
    }
    /**
     * Act - do whatever the GymWarp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(Player.class) ){
            if(pokemon1 >=7){
            FinalFight w = new FinalFight();
            Greenfoot.setWorld(w);
           }else{
               Instructions w = new Instructions();
            Greenfoot.setWorld(w);
           }
        }
    }
}
