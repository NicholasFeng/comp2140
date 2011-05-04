public class Fib
{
	public static void main (String [] args)
	{
		long start;
		for (int i = 0; i < 100; i++)
		{
			start = System.currentTimeMillis();
			System.out.println("The "+ i + "th answer is " + fib(i) );
			System.out.println("Running time is " + (System.currentTimeMillis() - start) );
		}
	}
	
	static long fib(int num)
	{
		long last = 1;
		long twoAgo = 1;
		long curr = 1;
		for (int i = 1; i < num; i++)
		{
			curr = last + twoAgo;
			
			twoAgo = last;
			last = curr;
		}
		
		return curr;
	}
}