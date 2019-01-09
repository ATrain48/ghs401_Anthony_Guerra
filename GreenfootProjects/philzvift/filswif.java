import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class filswif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class filswif extends Actor
{
    /**
     * Act - do whatever the filswif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private int speed;

    // boolean isEdge;
    public filswif()
    {   
        this.speed = 10000;
        this.name = "Phil Swift";
    }
    public filswif(int speed, String name)
    {
        this.speed = speed;
        this.name = name;
    }
    public void act() 
    {
        /*
         */ move(this.speed);
        if (isAtEdge())
        {
            int turnt = (int)(Math.random()*(89)+1);
            turn(turnt);
            System.out.println(turnt);
            //turn((int)turnt);
        } 
        getWorld().showText(toString(),getWorld().getWidth()/2 , getWorld().getHeight()/2);
        //getWorld().showText("x-coor: " + this.getX(),getWidth()/2,200);
        //getWorld().showText("y-coor: " + this.getY(),getWidth()/2,230);
        //getWorld().showText("Name: " + this.name, getWidth()/2, 170);
        //getWorld().showText("Speed: " + this.speed, getWidth()/2,140);
        //getWorld().showText("Speed: " + this.speed, getWidth()/2,140);

    } 
    public String toString()
    {
        
        String output=("Name: " + this.name+ "Speed: " + this.speed+ "x-coor: " + this.getX()+ "y-coor: " + this.getY()); 
        
        return output;
    }
        
        
    
}
