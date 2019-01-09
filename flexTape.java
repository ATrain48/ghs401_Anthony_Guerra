
/**
 * IDK something we did in class 12/18/2018
 * 
 * Anthony Guerra
 * 
 */
public class flexTape
{
    //this is a class called flexTape : THE POWERFULL WATERPROOF SEAL!!!
    //from this class, we can make as many
    //tape instances(objects) as we want
    
    //instance variables 
    private boolean hasTape;
    private int numBoats;
    private String philSwift;
    
    //zero-arguement instructor
    //this runs everytime a zero-arg flexTape is made
    //always is named public className
    
    public flexTape()
    {
        
        //sets all instance variables to generic values
        this.hasTape = false;
        this.numBoats = 0;
        this.philSwift = null;
        
    }
    
    //multi-arg constructor
    public flexTape(boolean hasTape,int numBoats,String philSwift)
    {
        //sets the instance variables to the argument variables
        this.hasTape = hasTape;
        this.numBoats = numBoats;
        this.philSwift = philSwift;
        
    }
    
    //toString method
    public String toString()
    {
        
        String output = "Does Flex: " + this.hasTape + "\nRolls: " + this.numBoats + "\nPhil Swift: " + this.philSwift;
        return output;
    }
    
   
}
