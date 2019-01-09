import javax.swing.JOptionPane;
/**
 * program decects grade based on user input
 */
public class grades
{
   public static void grades()
   {
      int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
      while (input > 100 || input < 0)
       {
          input = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
      }
      
       if (input >= 90)
       {
           System.out.println("You have an A!");
        }
       else if (input >= 80)
       {
           System.out.println("You have a B!");
        }
       else if (input >= 70)
       {
           System.out.println("You have a C!");
        }
       else if (input >= 60)
       {
           System.out.println("You have a D!");
        }
       else
       {
           System.out.println("You have an F!");
        }
   }
}
