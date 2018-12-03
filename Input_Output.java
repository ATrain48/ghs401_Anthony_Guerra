import javax.swing.JOptionPane;


/**
 * Write a description of class Input_Output here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input_Output
{
   public static void main()
   {
       
       String username = JOptionPane.showInputDialog("Please enter your username.");
       if(username.equals("anthony"))
         {
           String password = JOptionPane.showInputDialog("Please enter your password.");
             if(password.equals("guerra"))
             {
                 System.out.println("Welcome, Anthony!");
                }
                
             else
             {
                System.out.println("Incorrect Username!"); 
                }
                
         }
       else
       {
          System.out.println("Incorrect Password!"); 
       }

    }
}

 /*String password = JOptionPane.showInputDialog("Please enter your password");
             if(password.equals ("Password"));
             {
                System.out.ptintln("Access Granted");    
                }
                else
                {
                   System.out.ptintln("Access Granted");    
                } */