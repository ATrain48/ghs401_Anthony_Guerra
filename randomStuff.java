
/**
 * Write a description of class randomStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class randomStuff
{
   public static void main()
   {
       for(int i=0; i<5; i++)
       {
       //cast a random number to an integer
       int age = (int)(Math.random()*8)+367;
       
       System.out.println("The number is " + age + "!");
       
      }
    }
}
