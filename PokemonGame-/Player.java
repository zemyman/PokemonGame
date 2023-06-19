import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //ALL FOR MOVEMENT
    public int deltaX ;
    public int deltaY;
    public int speed = 1;
    public String DirectionV;
    public String DirectionH;
    public static boolean hasHealthPotion = false;
    public void act(){
    
        //Images
         GreenfootImage west = new GreenfootImage("PlayerW.png");
         GreenfootImage north = new GreenfootImage("PlayerB.png");
         GreenfootImage east = new GreenfootImage("PlayerE.png");
         GreenfootImage south = new GreenfootImage("PlayerS.png");
       //Movement
      if(isTouching(SmallVBound.class)){
          if(DirectionV == "l"){
              setLocation(getX() +2 , getY() );
          }
          if(DirectionV == "r"){
              setLocation(getX() -2 , getY() );
          }
        }
        if(isTouching(SmallHbounds.class)){
           if(DirectionH == "n"){
                setLocation(getX()  , getY() + 2);
            }if(DirectionH =="s"){
                setLocation(getX()  , getY() - 2);
            }
        }
        if(isTouching(Bounds.class)){
           if(DirectionH == "n"){
                setLocation(getX()  , getY() + 2);
            }if(DirectionH =="s"){
                setLocation(getX()  , getY() - 2);
            }
        }
        if(isTouching(BoundsSide.class)){
             if(DirectionV == "l"){
              setLocation(getX() +2 , getY() );
          }
          if(DirectionV == "r"){
              setLocation(getX() -2 , getY() );
          }
        }
       
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("s")){
          
          if (Greenfoot.isKeyDown("w")){
            deltaY = speed * -1;
            setImage(north);
            DirectionH ="n";
            }
            else if (Greenfoot.isKeyDown("s")){
            deltaY = speed;
            setImage(south);
            DirectionH ="s";
            }
                   }
         else{
            deltaY = 0;
             }
             
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d")) {
           
           if (Greenfoot.isKeyDown("a")){
            deltaX = speed * -1;
            setImage(west);
            DirectionV = "l";
            }
            else if (Greenfoot.isKeyDown("d")){
            deltaX = speed;
            setImage(east);
            DirectionV ="r";
            }
       
        
        }else{
            deltaX = 0;
            }
        //updating the players posistion
        
        setLocation(getX() +  deltaX , getY() + deltaY);
        if(isTouching(HealthPotion.class)){
        hasHealthPotion = true;
        TopOfMap.healthWillSpawn = false;
        removeTouching(HealthPotion.class);
       }
    
    }
    //Method for sharing what the starter pokemon is
    //and for updating it accross worlds when they evolve.
    

    public static void whatS(int start){
        
        Spawn.pokemonDisplay(start);
        Forest.pokemonDisplay(start);
        Battle.pokemon1U(start);
        PlayerFight.pokemon1U(start);
       FinalFight.pokemonU1(start);
      GymWarp.pokemonDisplay(start);
      TopOfMap.pokemonDisplay(start);
      //METHOD FOR SHARING POKEMON
    }
  }
    
 

