
/**
 * Project with Noah and Anthony
 */
public class Confusion
{
   
   public static void main()
   {
       for (int i = 1; i<11 ; i++)
       {
           int y = i*i;
           int x = (int)((Math.random()*(y-i))+(i+1));
           //System.out.println(x);
           String a = " ";

           if(x==i)
           {
               a = ("The random value is equal to the index.");
            }
            else if( x == y)
            {
               a = "The random value is equal to the square of the index.";
            }
           System.out.println(i+"\t"+(y)+"\t"+x + "\t" + a);
        }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
