public class FibBad
{
	// 1 1 2 3 5 8 
	public static void main (String [] args)
	{
		long start;
		for (int i = 0; i < 90; i++)
		{
			start = System.currentTimeMillis();
			//System.out.println("The "+ i + "th answer is " + fib(i) );
			//System.out.println("Running time is " + (System.currentTimeMillis() - start) );
			
			fib(i);
			System.out.println(i + " " + (System.currentTimeMillis() - start) );
			
		}
		
	}
	
	static long fib(int num)
	{
		// base case
		long retValue = 1;
		
		//recursive case
		if (num > 1)
			retValue = fib(num - 1) + fib(num - 2);
		
		return retValue;
	}
}