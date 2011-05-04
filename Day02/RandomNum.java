import java.util.Random;

public class RandomNum
{
	public static void main (String args[])
	{
		
		// Two ways to do this
		
		// Use a random number generator.  More overhead... good for actual simulations
		Random generator = new Random();
		
		for (int i = 0; i < 10; i++)
			System.out.println("Random number generator " + i +": " + generator.nextDouble() );
		
		System.out.println();
		
		// use Math.random
		for (int i = 0; i < 10; i++)
			System.out.println("Math.random number " + i + ": "+ Math.random() );
		
		
		// or if we want to get integers:
		System.out.println();

		
		for (int i = 0; i < 10; i++)
			System.out.println("Random number generator " + i +": " + generator.nextInt() );
		
		System.out.println();
		
		// use Math.random
		for (int i = 0; i < 10; i++)
			System.out.println("Math.random number " + i + ": "+ (int)(Math.random() * 10) ); 
		//Will this ever get to be 10?
		
		
		// controlled between two numbers
		for (int i = 0; i < 10; i++)
			System.out.println("Controlled number " + i + ": "+ getRandInt(2,20) );

		
	}
	
	static int getRandInt()
	{
		return (int) (Math.random() * 10); 
	}
	
	// lame way of doing it
	static int getRand(int size)
	{
		return ((int)(Math.random()*10000))%size;
	}
	
	static int getRandInt(int min, int max)
	{
		double rand = Math.random() * (max + 1 - min);
		
		return (int) rand + min;
	}
	
	static int getRandInt(int max)
	{
		// why write it twice?
		return getRandInt(0,max);
	}
}

