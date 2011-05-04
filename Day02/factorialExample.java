import java.io.*;

public class factorialExample
{
   public static int fact( int n )
   {
      int result;

      if (n == 0)
        result = 1;
      else
        result = n * fact(n-1);

      return result;
   } // end fact

   public static void main( String[] args )
   {
      System.out.println("fact(4) = " + fact(4));
   } // end main
} // end class factorialExample
