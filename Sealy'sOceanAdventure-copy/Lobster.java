import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Characters
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge ( );
        randomTurn ( );
        move ( 2 );
        lookForSeal ( );
    }
    
    public void turnAtEdge()
    {
        if (isAtEdge ( )) {
            turn ( 17 );
        }
    }
    
    public void randomTurn()
    {
        if (Greenfoot . getRandomNumber ( 100 ) > 90) {
            turn ( Greenfoot . getRandomNumber ( 90 ) - 45 );
        }
    }
    
    public void lookForSeal()
    {
        if (isTouching ( Seal.class )) {
            getWorld().addObject(new YouDied(),400,300);
            Greenfoot.playSound ( "au.wav" );
            getWorld().removeObject(this);
            Greenfoot.stop ( );
        }
    }
}
