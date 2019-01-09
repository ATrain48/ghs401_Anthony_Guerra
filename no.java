
/**
 *  project with Noah and Anthony
 */
public class no
{
   public static void main()
   {
       String[] movies = new String[3];
       movies[0] = "The Bee Movie";
       movies[1] = "The Emoji Movie";
       movies[2] = "Honey I Shrunk the Kids";
       String[] songs = new String[3];
       songs[0] = "Gangnam Style";
       songs[1] = "Mans Not Hot";
       songs[2] = "U.S. National Anthem";
       //String[] comma = new String[3];
       //comma[0] = ",";
       //comma[1] = ",";
       //comma[2] = " ";
       String comma2 = ",";
       int a = 0;
       System.out.println(" ");
       for(int i = 0; i<3; i++)
       {
           System.out.println(movies[i]);
        }
       while (a < songs.length)
       {
           if(a < songs.length-1)
           {
               System.out.print(songs[a] + comma2 + " ");
            }
           else
           {
               System.out.print(songs[a]);
           }
           //System.out.print(songs[a] + comma[a] + " ");
           a++;
           
       }
    }
}
