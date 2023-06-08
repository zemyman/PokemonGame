import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle extends World
{
    public static int pokemon1;
    public boolean display = true;
    public boolean ball1 = true;
    public boolean ball2 = true;
    public boolean ball3 = true;
    public static int thro = 0;
    public  static int pokemon2;
    public  static int pokemon3;
    public static boolean dele;
    //passing info
    public static void pokemon1U(int poke){
        pokemon1 = poke;
    }
    
   
  
    /**
     * Constructor for objects of class Battle.
     * 
     */
    public Battle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        PlayerFight PlayerFight = new PlayerFight();
        addObject(PlayerFight, 600, 328);
        if(dele = true){
            removeObject(new throwBall());
        }
        
        if(display = true){
            if(pokemon1 == 1){
            addObject(new Bulbasur(),395, 360);
            addObject(new BulbasurFight(),240, 284);
         }
         else if(pokemon1 == 2){
            addObject(new Charmander(),395, 360);
            addObject(new CharmanderFight(),240, 284);
         }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),395, 360);
            addObject(new SquirltleFight(),240, 284);
            
         }
          else if(pokemon1 == 4){
            
         }
          else if(pokemon1 == 5){
            
         }
          else{
            addObject(new PokeballSprite(),395, 360);
         }
         
       
            addObject(new PokeballSprite(),317, 360);
            addObject(new PokeballSprite(),356, 360);
          }
         addObject(new throwBall(),163,375);
         int randP = Greenfoot.getRandomNumber(3);
         if(randP == 1 || randP==0){
             addObject(new BulbasurFight2(),10,154);
         }
         if(randP == 2){
             addObject(new SquirtleFight2(),10,154);
         }
         if(randP == 3){
             addObject(new CharmanderFight(),10,154);
         }
    }
       
}

