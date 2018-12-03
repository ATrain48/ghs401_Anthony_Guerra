//ask for GPA

import javax.swing.JOptionPane;

public class GPA
{
    // instance variables - replace the example below with your own
    private Double x;

    /**
     * Constructor for objects of class GPA
     */
    public static void GPA()
    {
       Double gpa = Double.parseDouble(JOptionPane.showInputDialog("Please enter your GPA."));
       //parse changes from string to double
       
       if(gpa > 4.0)
       {
           System.out.println("Smarty pants!");
        }
       else if(gpa >= 0)//only runs when first if is false. This means our GPA is between 4.0 and 0.0
       {
           System.out.println("Ok");
        }
       else
       {
           System.out.println("Impossible!");
        }
      
    }

    
}
