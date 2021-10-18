import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Seal seal = new Seal();
        addObject(seal,147,293);
        Fish fish = new Fish();
        addObject(fish,Greenfoot.getRandomNumber(800),70);
        Fish fish2 = new Fish();
        addObject(fish2,Greenfoot.getRandomNumber(800),496);
        Fish fish3 = new Fish();
        addObject(fish3,Greenfoot.getRandomNumber(800),417);
        Fish fish4 = new Fish();
        addObject(fish4,Greenfoot.getRandomNumber(800),524);
        Fish fish5 = new Fish();
        addObject(fish5,Greenfoot.getRandomNumber(800),179);
        Lobster lobster = new Lobster();
        addObject(lobster,558,351);
        Star star = new Star();
        addObject(star,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(600));
        star.setLocation(Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(600));
        Dolphin dolphin = new Dolphin();
        addObject(dolphin,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(600));
    }
    
}
