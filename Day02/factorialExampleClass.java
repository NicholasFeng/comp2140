import java.io.*;

public class factorialExampleClass
{
   
   
   public static int fact( int n )
   {
	   
	   System.out.print(n + " ");
	   int returnValue = 0;
	   
	   
	   // recursive case
	   if (n > 1)
	   {
	       returnValue = n * fact(n);
	       System.out.println( "Returns " + returnValue);
	   }
	   else
	   {
	       // base case
	       returnValue = 1;
       }
	   
	   
	   return returnValue;

   }

   public static void main( String[] args )
   {
      System.out.println("fact(4) = " + fact(4));
   }
} 
