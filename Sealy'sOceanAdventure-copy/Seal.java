import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Characters
{
    private int frame = 1;
    private int animate = 0;
    private int fishCount = 0;
    private GreenfootImage seal1 = new GreenfootImage("seal.png");
    private GreenfootImage seal2 = new GreenfootImage("seal_Copy.png");
    World myWorld = getWorld();
    private int randomFish = 0;
    private int fishFriend = 1;
    private int dolphinCount = 0;
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        eatingFish();
        touchStar();
        animateRight();
        eatingDolphin();
    }
    
    public void movement()
    {
        move (4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void animateRight ()
    {
        if (animate == 0) {
            if (frame == 1)
            {
                setImage(seal1);
                frame = 2;
            }
            else if (frame == 2)
            {
                setImage(seal2);
                frame = 1;
            }
            animate++;
        }
        else if (animate == 5) {
            animate = 0;
        } else {
            animate++;
        }
    }
    
    public void eatingFish()
    {
        if (isTouching (Fish.class)){
            fishCount++;
            getWorld().showText("FISH EATEN : " + fishCount,710,20);
            removeTouching (Fish.class);
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject (new Fish(),Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
    }
    
    public void eatingDolphin()
    {
        if (isTouching (Dolphin.class)){
            dolphinCount++;
            getWorld().showText("DOLPHIN EATEN : " + dolphinCount,690,40);
            removeTouching (Dolphin.class);
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject (new Dolphin(),Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
    }
    
    public void touchStar()
    {
        if (isTouching(Star.class)) 
        {
            getWorld().addObject(new YouDied(),400,300);
            Greenfoot.playSound ( "au.wav" );
            removeTouching (Dolphin.class); 
            Greenfoot.stop ( );
        }
    }
}
