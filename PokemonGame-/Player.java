import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int deltaX ;
    public int deltaY;
    public int speed = 1;
    
    public void act(){
    
        //Images
         GreenfootImage west = new GreenfootImage("PlayerW.png");
         GreenfootImage north = new GreenfootImage("PlayerB.png");
         GreenfootImage east = new GreenfootImage("PlayerE.png");
         GreenfootImage south = new GreenfootImage("PlayerS.png");
       //Movement
      
       if(isTouching(smallVBound.class) == false && isTouching(BoundsSide.class) == false && isTouching(Bounds.class) == false && isTouching(SmallHbounds.class) == false ){
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("s")){
          
          if (Greenfoot.isKeyDown("w")){
            deltaY = speed * -1;
            setImage(north);
            }
            else if (Greenfoot.isKeyDown("s")){
            deltaY = speed;
            setImage(south);
            }
                   }
         else{
            deltaY = 0;
             }
             
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d")) {
           
           if (Greenfoot.isKeyDown("a")){
            deltaX = speed * -1;
            setImage(west);
            }
            else if (Greenfoot.isKeyDown("d")){
            deltaX = speed;
            setImage(east);
            }
       
        
        }else{
            deltaX = 0;
        }
        //updating the players posistion
        
        setLocation(getX() +  deltaX , getY() + deltaY);
        
    }else{
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d") == false){
            setLocation(getX() + 1 , getY() );
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("a") == false){
            setLocation(getX() - 1 , getY() );
        }
        if(Greenfoot.isKeyDown("w")&& Greenfoot.isKeyDown("s") == false){
            setLocation(getX()  , getY() +1 );
        }
        if(Greenfoot.isKeyDown("s")&& Greenfoot.isKeyDown("w") == false){
            setLocation(getX()  , getY() - 1 );
        }
    }
}
    public static void whatS(int start){
        
        spawn.pokemonDisplay(start);
        Forest.pokemonDisplay(start);
        Battle.pokemon1U(start);
        PlayerFight.pokemon1U(start);
        
    }
}
    
 

