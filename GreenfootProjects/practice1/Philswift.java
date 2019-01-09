import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Anthony Guerra == phil swift actor code thing
 */
public class Philswift extends Actor
{
    
    //instance variables
    private int speed;
    
    /**
     * Act - do whatever the Philswift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Philswift() 
    {
        this.speed = 1;
    }    
    public Philswift(int speed)
    {
        this.speed = speed;
    }
    public void act()
    {
        move(this.speed);
        if( isAtEdge() )
        {
            turn(128);
        }
        getWorld().showText("x-coor: " + this.getX(),200,200);
    }
}
