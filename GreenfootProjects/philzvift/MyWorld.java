import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1800, 1800, 1); 
        addObject(new filswif(10, "Phil Swift"), 100, 100);
        addObject(new filswif(6, "Phil Swift"), 100, 100);
        addObject(new filswif(15, "Phil Swift"), 100, 100);
        addObject(new filswif(9, "Phil Swift"), 100, 100);
        addObject(new filswif(1, "Phil Swift"), 100, 100);
        addObject(new filswif(20, "Phil Swift"), 100, 100);
        addObject(new filswif(13, "Phil Swift"), 100, 100);
        addObject(new filswif(60, "Phil Swift"), 100, 100);
    }
}
