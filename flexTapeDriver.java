
/**
 * IDK
 * 
 * Anthony Guerra
 * 
 */
public class flexTapeDriver
{
   public static void main()
   {

       //make one instance(object) of flexTape class
       flexTape philSwift1 = new flexTape();
       flexTape philSwift2 = new flexTape(true,100,"Yeet!");
       flexTape philSwift3 = new flexTape(true,5,"Hi I'm Phil Swift!!!");
       //print the toString of the object
       System.out.println(philSwift1.toString());
       System.out.println();
       System.out.println(philSwift2);
        System.out.println();
       System.out.println(philSwift3);
    }
}
