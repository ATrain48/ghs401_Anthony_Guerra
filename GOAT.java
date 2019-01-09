import javax.swing.JOptionPane;
/**
 * Hi
 */
public class GOAT
{
   public static void goat()
   {
       int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 10 and 20!"));
       int greatest = 100;
       int lowest = 0;
       while( x > 100 || x < 10)
       {
           x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 10 and 20!"));
        }
       
       int[] y = new int[x];
       for(int i = 0; i < x; i++)
       {
           y[i] = (int)(Math.random()*(91)+10);
           System.out.print(y[i] + "\t");
            if (greatest > y[i])
            {
               greatest = y[i];
            }
            if (lowest < y[i])
            {
                lowest = y[i];
            }
           
        }
       System.out.println(greatest + " " + lowest);
    }
}
