import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFight extends Actor
{
         GreenfootImage red = new GreenfootImage("ashred.png");
          GreenfootImage blank = new GreenfootImage("blank.png");
         public static int pokemon1;
         public static int health;
         public  static boolean YourTurn ;
         public static int playerHealth= 100;
        public static int enemyHealth= 100;
        public int turn = 0;
        public static int xp = 0;
        public static int finalxp = 0;
       public static void pokemon1U(int poke){
        pokemon1 = poke;
    }
    /**
     * Act - do whatever the PlayerFight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
            for(int a = 0; a < 5; a++){
            if(getX()!=84){
            setLocation(getX()  - 1 , getY());
        } if (getX() == 84){
            //Battle.waits(5);
            setLocation(84 , getY());
            setImage(red);
             
            
            //FIRST POKEMON
            
        }
        }
        
        
        if(turn == 0){
            //MOVES
          if(Greenfoot.isKeyDown("r") ){
              if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=8;
                    }else{
                        enemyHealth -=4;
                    }
              }else{
                  enemyHealth -=2;
              }
             
             turn = 1;
          }
           else if(Greenfoot.isKeyDown("t")){
            
             if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=9;
                    }else{
                        enemyHealth -=6;
                    }
              }else{
                  enemyHealth -=3;
              }
             turn = 1;
          }
           else if(Greenfoot.isKeyDown("y") ){
             if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=8;
                    }else{
                        enemyHealth -=6;
                    }
              }else{
                  enemyHealth -=4;
              }
             turn = 1;
          }
        }
        if(turn == 1){
            int p = Greenfoot.getRandomNumber(2);
            if(p==0){
               playerHealth -=1;  
               setImage(blank);
               Greenfoot.delay(3);
               setImage(red);
              turn = 0;
            }
            else if(p==1){
             playerHealth -= 3;
             setImage(blank);
               Greenfoot.delay(3);
               setImage(red);
            turn = 0;
            }
            else if(p==2){
              playerHealth -=2;
              setImage(blank);
               Greenfoot.delay(3);
               setImage(red);
             turn = 0;
            }
        }
        if(playerHealth < 0){
            PokemonCenter1 w = new PokemonCenter1();
            Greenfoot.setWorld(w);
        }
        if(enemyHealth < 0){
            spawn w = new spawn();
            Greenfoot.setWorld(w);
            enemyHealth = 100;
            xp += 100;
            finalxp += 20;
        }
        if(xp >= 300){
            xp = 0;
            if(pokemon1 == 1){
            Player.whatS(4);
        }
         if(pokemon1 == 2){
            Player.whatS(5);
        }
         if(pokemon1 == 3){
            Player.whatS(6);
        }
           
     }
     if(finalxp == 100){
         if(pokemon1 == 4){
            Player.whatS(7);
        }
         if(pokemon1 == 5){
            Player.whatS(8);
        }
         if(pokemon1 == 6){
            Player.whatS(9);
        }

     }
   
   }
}
