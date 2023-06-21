import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topOfMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopOfMap extends World
{
    public static int pokemon1;
    public boolean display = true;
    public static boolean healthWillSpawn = true;
    public static void pokemonDisplay(int pokemon){
        pokemon1 = pokemon;
    }

    /**
     * Constructor for objects of class topOfMap.
     * 
     */
    public TopOfMap()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(631, 309, 1, false); 
        addObject(new Player(),413, 258);
        addObject(new GymWarp(), 166, 157);
        addObject(new GymSprite(), 167, 87);
        addObject(new SpawnWarp(), 440, 308);
        if(display == true){
        if(pokemon1 == 1){
            addObject(new Bulbasur(),26,289);
            
         }
         else if(pokemon1 == 2){
            addObject(new Charmander(),26,289);
            
         }
          else if(pokemon1 == 3){
            addObject(new Squirtle(),26,289);
            
         }
         else if(pokemon1 == 6){
            addObject(new Wartortle(),26,289);
         }
          else if(pokemon1 == 5){
            addObject(new Charmeleon(),26,289);
         }
         else if(pokemon1 == 4){
            addObject(new Ivysaur(),26,289);
         }
         else if(pokemon1 == 9){
            addObject(new Blastoise(),26,289);
         }
         else if(pokemon1 == 8){
            addObject(new Charizard(),26,289);
         }
         else if(pokemon1 == 7){
            addObject(new Venusaur(),26,289);
         }
        else{
            addObject(new PokeballSprite(),26,289);
        }
    }
    //bounds
    addObject(new SmallVBound(),249,84);
    addObject(new SmallVBound(),108,120);
    addObject(new SmallVBound(),536,222);
    addObject(new SmallVBound(),421,119);
    addObject(new SmallVBound(),108,177);
    addObject(new SmallVBound(),549,161);
    addObject(new SmallVBound(),254,193);
    addObject(new SmallVBound(),383,305);
    addObject(new SmallVBound(),497,110);
    addObject(new SmallVBound(),354,276);
    addObject(new SmallVBound(),536,278);
    addObject(new SmallVBound(),421,176);
    addObject(new SmallVBound(),622,113);
    addObject(new BoundsSide(),343,287);
    addObject(new BoundsSide(),310,284);
    addObject(new SmallHbounds(),279,87);
    addObject(new SmallHbounds(),217,112);
    addObject(new SmallHbounds(),114,208);
    addObject(new SmallHbounds(),281,163);
    addObject(new SmallHbounds(),351,277);
    addObject(new SmallHbounds(),335,86);
    addObject(new SmallHbounds(),194,116);
    addObject(new SmallHbounds(),224,207);
    addObject(new SmallHbounds(),329,138);
    addObject(new SmallHbounds(),391,304);
    addObject(new SmallHbounds(),391,86);
    addObject(new SmallHbounds(),138,115);
    addObject(new SmallHbounds(),167,207);
    addObject(new SmallHbounds(),328,243);
    addObject(new SmallHbounds(),486,305);
    addObject(new SmallHbounds(),517,306);
    addObject(new SmallHbounds(),560,192);
    addObject(new SmallHbounds(),469,137);
    addObject(new SmallHbounds(),614,88);
    addObject(new SmallHbounds(),622,135);
    addObject(new SmallHbounds(),449,136);
    addObject(new SmallHbounds(),525,87);
    addObject(new SmallHbounds(),570,87);
    addObject(new SmallHbounds(),576,134);
   
    if(healthWillSpawn){
            addObject(new HealthPotion(),594,112);
        }
  }
}
