
/**
 * Anthony Guerra Yeet
 * 
 */
public class HolidayCharacter
{
   private String name;
   private boolean hasSpirit;
   private int presents;
   
   public HolidayCharacter()
   {
       
       this.name = null;
       this.hasSpirit = false;
       this.presents = 0;
       
    }
    
   public HolidayCharacter(String name, boolean hasSpirit, int presents)
   {
       
       this.name = name;
       this.hasSpirit = hasSpirit;
       this.presents = presents;
       
    }
    
   public String toString()
   {
       
       String output = "Name: " + this.name + "\nHas Spirit: " + hasSpirit + "\nPresents: " + presents;
       return output;
       
    }
}
