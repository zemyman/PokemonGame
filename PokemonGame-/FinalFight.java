import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalFight extends World
{
    public boolean display = true;
    public static int  pokemon1;
public static void pokemonU1(int poke){
        pokemon1 = poke;
    }
    /**
     * Constructor for objects of class FinalFight.
     * 
     */
    public FinalFight()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new PlayerFight(), 576, 329);
        addObject(new throwBall(), 165, 374);
        addObject(new finalGymEnemy(), 0, 63);
        addObject(new throwballEnemy(), 455, 78);
        addObject(new GymCharmeleonFight(), 391,151);
        addObject(new healthbarPlayer(),450,290);
        addObject(new healthbarEnemy(),130,180);
        //for displaying pokemon in party and for battle
         if(display = true){
            if(pokemon1 == 1){
            addObject(new Bulbasur(),317, 360);
            addObject(new BulbasurFight(),240, 284);
            BattleinfoB1();
         }
         else if(pokemon1 == 2){
            addObject(new Charmander(),317, 360);
            addObject(new CharmanderFight(),240, 284);
            BattleinfoC1();
         }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),317, 360);
            addObject(new SquirltleFight(),240, 284);
             BattleinfoS1();
         }
         else if(pokemon1 == 6){
            addObject(new Wartortle(),317, 357);
            addObject(new WartortleFight(),240, 284);
            BattleinfoS2();
         }
          else if(pokemon1 == 5){
            addObject(new Charmeleon(),317, 357);
            addObject(new CharmeleonFight(),240, 284);
            BattleinfoC2();
         }
         else if(pokemon1 == 4){
            addObject(new Ivysaur(),317, 357);
            addObject(new IvysaurFight(),240, 284);
            BattleinfoB2();
         }
         else if(pokemon1 == 9){
            addObject(new Blastoise(),317, 357);
            addObject(new BlastoiseFight(),240, 284);
            BattleinfoS3();
         }
         else if(pokemon1 == 8){
            addObject(new Charizard(),317, 357);
            addObject(new CharizardFight(),240, 284);
            BattleinfoC3();
         }
         else if(pokemon1 == 7){
            addObject(new Venusaur(),317, 357);
            addObject(new VenusaurFight(),240, 284);
            BattleinfoB3();
         }
        else{
            addObject(new PokeballSprite(),317,357);
        }
    }
}
public void BattleinfoS1(){
            getBackground().drawImage(new GreenfootImage("Attack List for Squirtle ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Aqua Jet", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Water Pulse", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Aqua Tail", 20, null, null), 30, 120);
        }
        public void BattleinfoS2(){
            getBackground().drawImage(new GreenfootImage("Attack List for Wartotle ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Aqua Jet", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Hydro Pump", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Ice Beam", 20, null, null), 30, 120);
        }
        public void BattleinfoS3(){
            getBackground().drawImage(new GreenfootImage("Attack List for Blastoise ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Skull Bash", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Hydro Cannon", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Ice Beam", 20, null, null), 30, 120);
        }
        public void BattleinfoC1(){
            getBackground().drawImage(new GreenfootImage("Attack List for Charmander ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Flamethrower", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Flame Charge", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Flame Burst", 20, null, null), 30, 120);
        }
        public void BattleinfoC2(){
            getBackground().drawImage(new GreenfootImage("Attack List for Charmeleon ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Dragon Breath", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Flare Blitz", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Inferno", 20, null, null), 30, 120);
        }
        public void BattleinfoC3(){
            getBackground().drawImage(new GreenfootImage("Attack List for Charizard ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Air Slash", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Dragon Claw", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Blast Burn", 20, null, null), 30, 120);
        }
        public void BattleinfoB1(){
            getBackground().drawImage(new GreenfootImage("Attack List for Bulbasur ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Seed Bomb", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Power Whip", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Sludge Bomb", 20, null, null), 30, 120);
        }
        public void BattleinfoB2(){
            getBackground().drawImage(new GreenfootImage("Attack List for Ivysaur", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Poisn Powder", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Synthesis", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Solar Beam", 20, null, null), 30, 120);
        }
        public void BattleinfoB3(){
            getBackground().drawImage(new GreenfootImage("Attack List for Venusaur ", 20, null, null), 30, 75);
            getBackground().drawImage(new GreenfootImage("R:Petal Blizzard", 20, null, null), 30, 90);
            getBackground().drawImage(new GreenfootImage("T:Frenzy Plant", 20, null, null), 30, 105);
            getBackground().drawImage(new GreenfootImage("Y:Sludge Bomb", 20, null, null), 30, 120);
        }
    
}
