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
       if(isTouching(smallVBound.class)){
            if(Greenfoot.isKeyDown("a")){
                setLocation(getX()  + speed , getY());
            }else{
                setLocation(getX()  - speed , getY() );
            }
        }
        if(isTouching(SmallHbounds.class)){
           if(Greenfoot.isKeyDown("w")){
                setLocation(getX()  , getY() + speed);
            }else{
                setLocation(getX()   , getY() - speed);
            }
        }
        if(isTouching(Bounds.class)){
            if(Greenfoot.isKeyDown("w")){
                setLocation(getX()  , getY() + speed);
            }else{
                setLocation(getX()  , getY() - speed);
            }
        }
        if(isTouching(BoundsSide.class)){
            if(Greenfoot.isKeyDown("a")){
                setLocation(getX()  + speed , getY());
            }else{
                setLocation(getX()  - speed , getY() );
            }
            
        }
       
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
        
    }
    public static void whatS(int start){
        
        spawn.pokemonDisplay(start);
        Forest.pokemonDisplay(start);
        Battle.pokemon1U(start);
        PlayerFight.pokemon1U(start);
        
    }
}
    
 

