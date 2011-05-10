
public class Loops {

   public static void main (String [] args) {

       int i = 0;
       // normal loop:
       while (i < 10)
       {
           System.out.println(i);
           i++;
       }
       
       recursiveLoop(0);
   }
   
   public static void recursiveLoop(int i )
   {
       if (i < 10)
       {
           System.out.println(i);
           recursiveLoop(i+1);  // <--- it's the last thing run!
       }
   }
}
