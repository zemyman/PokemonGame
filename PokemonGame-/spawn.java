import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spawn extends World
{
    public boolean display = true;
    public boolean ball1 = true;
    public boolean ball2 = true;
    public boolean ball3 = true;
    public  static int pokemon1;
    public  static int pokemon2;
    public  static int pokemon3;
    public static void pokemonDisplay(int pokemon){
        pokemon1 = pokemon;
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public spawn()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(631, 316, 1, false); 
        //Greenfoot.setWorld(new topOfMap());
        
        //ADDING PLAYER
        addObject(new Player(),500, 163);
        //BOUNDS
        
        //Waprs
        addObject(new SpawnToForestWarp(),486,259);
        if(display = true){
            if(pokemon1 == 1){
            addObject(new Bulbasur(),98, 293);
            
        }
         else if(pokemon1 == 2){
            addObject(new Charmander(),98, 293);
            
        }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),98, 293);
            
        }
          else if(pokemon1 == 4){
            
        }
          else if(pokemon1 == 5){
            
        }
        else{
            addObject(new PokeballSprite(),98, 293);
        }
            
            addObject(new PokeballSprite(),61, 293);
            addObject(new PokeballSprite(),21, 293);
        }
    }
    //Every pokemon has a number 
    //1 Bulbasour
    //2 charmander
    //3 Squitle
    //4
    //5
    
}
