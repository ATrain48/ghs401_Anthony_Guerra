import javax.swing.JOptionPane;
/**
 * Write a description of class WhileLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhileLoops
{
   public static void main()
   {
       String age = JOptionPane.showInputDialog("Please enter your age.");
       int age1 =Integer.parseInt(age);
       while (age1 < 0 || age1 > 120)
       {
           
          age1 =Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
       
        }
       System.out.println("I don't care");
   }
}
