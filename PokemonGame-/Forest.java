import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
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
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1, false); 
        //Adding player
        addObject(new Player(),216, 8);
        //adding bounds
        /*addObject(new Wall(108, 255), 134, 125);
        addObject(new Wall(30, 138), 203, 136);
        addObject(new Wall(19, 45), 227, 137);
        addObject(new Wall(15, 81), 87, 293);
        addObject(new Wall(65, 12), 112, 340);
        addObject(new Wall(63, 176), 176, 392);
        addObject(new Wall(15, 115), 280, 422);
        addObject(new Wall(128, 122), 320, 304);
        addObject(new Wall(31, 33), 399, 243);
        addObject(new Wall(15, 69), 407, 192);
        addObject(new Wall(111, 63), 359, 126);
        addObject(new Wall(77, 63), 311, 160);
        addObject(new Wall(45, 48), 296, 71);
        addObject(new Wall(15, 63), 266, 31);
         */
        //addObject(new BorderV(10,254), 181,126);
        //addObject(new BorderV(10,145), 213,136);
        //addObject(new BorderV(10,90), 90,293);
        //addObject(new BorderV(10,178), 203,388);
        //addObject(new BorderV(10,286), 246,351);
        addObject(new BorderV(10,253), 178,0);
        addObject(new BorderV(10,136), 207,70);
        addObject(new BorderV(10,81), 86,253);
        addObject(new BorderV(10,31), 146,303);
        addObject(new BorderV(10,176), 197,304);
        addObject(new BorderV(10,239), 272,241);
        addObject(new BorderV(10,82), 401,158);
        addObject(new BorderV(10,48), 325,158);
        addObject(new BorderV(10,145), 289,61);
        addObject(new BorderV(10,60), 256,0);
        
        addObject(new BorderH(28,10), 188,69);
        addObject(new BorderH(28,10), 188,197);
        addObject(new BorderH(91,10), 96,244);
        addObject(new BorderH(50,10), 96,335);
        addObject(new BorderH(59,10), 147,303);
        addObject(new BorderH(128,10), 273,240);
        addObject(new BorderH(66,10), 335,148);
        addObject(new BorderH(44,10), 290,197);
        addObject(new BorderH(32,10), 257,51);

        //warps
        addObject(new ForestToSpawnWarp(),240, 470);
        addObject(new WanderingPokemon1(),293, 208);
        
         if(display = true){
            if(pokemon1 == 1){
            addObject(new Bulbasur(),395, 360);
            
         }
         else if(pokemon1 == 2){
            addObject(new Charmander(),395, 360);
            
         }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),395, 360);
            
         }
          else if(pokemon1 == 4){
            
         }
          else if(pokemon1 == 5){
            
         }
          else{
            addObject(new PokeballSprite(),395, 360);
         }
            
            addObject(new PokeballSprite(),317, 357);
            addObject(new PokeballSprite(),356, 358);
          }
    }
    
}
