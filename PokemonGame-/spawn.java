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
        addObject(new pokemoncentersprite(), 158, 117);
        //ADDING PLAYER
        addObject(new Player(),500, 163);
        //BOUNDS
        addObject(new Bounds(),378, 288);
        addObject(new BoundsSide(),524, 141);
        addObject(new Bounds(),274, 228);
        addObject(new BoundsSide(),127, 135);
        addObject(new Bounds(),242, 30);
        addObject(new smallVBound(),389, 4);
        addObject(new smallVBound(),451, 256);
        addObject(new smallVBound(),451, 198);
        addObject(new smallVBound(),420, 200);
        addObject(new SmallHbounds(),434,170);
        //Waprs
        addObject(new topMapWarp(),416,18);
        addObject(new forestWarp(),486,259);
        addObject(new PokemonCenterTp(), 150, 151);
        if(display = true){
            if(pokemon1 == 1){
            addObject(new Bulbasur(),21, 293);
            
        }
         else if(pokemon1 == 2){
            addObject(new Charmander(),21, 293);
            
        }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),21, 293);
            
        }
        else if(pokemon1 == 6){
            addObject(new Wartortle(),21, 293);
         }
          else if(pokemon1 == 5){
            addObject(new Charmeleon(),21, 293);
         }
         else if(pokemon1 == 4){
            addObject(new Ivysaur(),21, 293);
         }
         else if(pokemon1 == 9){
            addObject(new Blastoise(),21, 293);
         }
         else if(pokemon1 == 8){
            addObject(new Charizard(),21, 293);
         }
         else if(pokemon1 == 7){
            addObject(new Venusaur(),21, 293);
         }
        else{
            addObject(new PokeballSprite(),21, 293);
        }
            //addObject(new PokeballSprite(),98, 293);
            //addObject(new PokeballSprite(),61, 293);
            
      }
    }
    //Every pokemon has a number 
    //1 Bulbasour
    //2 charmander
    //3 Squitle
    //4
    //5
    
}
