import javax.swing.JOptionPane;

/**
 * Write a description of class age here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class age
{
   public static void main()
   {
       String age = JOptionPane.showInputDialog("Please enter your age.");
       int age1 =Integer.parseInt(age);
       
        if (age1 >= 16)
       {
           System.out.println("You can legally drive with a license.");
        }
       else
       {
           System.out.println("Do not get near a wheel!");
        }
       
       
       
       
       
       
       
       
       
   }
}
