import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFight extends Actor
{
    //IMAGES
         GreenfootImage red = new GreenfootImage("ashred.png");
         GreenfootImage blank = new GreenfootImage("blank.png");
         //What pokemon the player is using
         public static int pokemon1;
         //Combat & health
         public static int playerHealth= 100;
        public static int enemyHealth= 100;
        public int turn = 0;
        //ex(for evelition)
        public static int xp = 0;
        public static int finalxp = 0;
         public static boolean finalfight;
       public static void pokemon1U(int poke){
           //Method to get players pokemon from player class
        pokemon1 = poke;
    }
    /**
     * Act - do whatever the PlayerFight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    //this is just the player sliding accros the screen affect
       move();
        //players turn to fight
        if(turn == 0){
            //MOVES
          if(Greenfoot.isKeyDown("r") ){
              //playerA# are methods for doing dammage
              playerA1();
             turn = 1;
          }
           else if(Greenfoot.isKeyDown("t")){
             playerA2();
             turn = 1;
          }
           else if(Greenfoot.isKeyDown("y") ){
             playerA3();
             turn = 1;
          }
          else if(Greenfoot.isKeyDown("g") && Player.hasHealthPotion){
              playerHeals();
              Player.hasHealthPotion = false;
              getWorld().addObject(new CrossoutLine(),503,145);
              turn = 1;
          }
        }
        if(turn == 1){
            enemyA();
        }
        
        if(playerHealth < 0){
            LoseScreen w = new LoseScreen();
            Greenfoot.setWorld(w);
        }
        if(enemyHealth < 0){
            if(finalfight ==true){
               FinalWin w = new FinalWin();
               Greenfoot.setWorld(w);
            }else{
            WinScreen w = new WinScreen();
            Greenfoot.setWorld(w);
           }
            enemyHealth = 100;
            xp += 100;
            finalxp += 20;
        }
        //evolution 2nd stage
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
     //evolution 3rd stage 
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
   public void enemyA(){
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
   public void playerA3(){
       if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=8;
                    }else{
                        enemyHealth -=6;
                    }
              }else{
                  enemyHealth -=4;
              }
   }
   public void playerA2(){
       if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=9;
                    }else{
                        enemyHealth -=6;
                    }
              }else{
                  enemyHealth -=3;
              }
   }
   public void playerA1(){
       if(pokemon1 == 4||pokemon1 == 5||pokemon1 == 6){
                  if(pokemon1 == 7 || pokemon1 == 8 || pokemon1 == 9 ){
                      enemyHealth -=8;
                    }else{
                        enemyHealth -=4;
                    }
              }else{
                  enemyHealth -=2;
              }
   }
   public void playerHeals(){
       playerHealth += 30;
       
   }
   public void move(){
       //this is just the player sliding accros the screen affect
            for(int a = 0; a < 5; a++){
            if(getX()!=84){
            setLocation(getX()  - 1 , getY());
        } if (getX() == 84){
            //Battle.waits(5);
            setLocation(84 , getY());
            setImage(red);
             //sets the images to the red variant 
            
            
            
        }
        }
        
   }
}
