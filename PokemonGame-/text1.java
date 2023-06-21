import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text1 extends Actor
{
    /**
     * Act - do whatever the text1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Spawn w = new Spawn("fromElse");
        if(Greenfoot.isKeyDown("1") ){
            Player.whatS(1);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
            WanderingPokemon1.x =1;
            WanderingPokemon2.x =1;
            WanderingPokemon3.x =1;
        }
        else if(Greenfoot.isKeyDown("2")){
            Player.whatS(2);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
            WanderingPokemon1.x =2;
            WanderingPokemon2.x =2;
            WanderingPokemon3.x =2;
        }
        else if(Greenfoot.isKeyDown("3") ){
            Player.whatS(3);
            Greenfoot.delay(3);
            Greenfoot.setWorld(w);
            WanderingPokemon1.x =3;
            WanderingPokemon2.x =3;
            WanderingPokemon3.x =3;
        }
    }
}
