/*
 * A second point example
 * This example shows true accessors and mutators.  
 * Accessors and mutators are the only way that people using the 
 * Point object can change the instance variables.
 * This way, we can validate the values they are passing us.
 * Note that the instance variables are now private
 */

public class pointTest2
{
	public static void main (String [] args)
	{
		Point myPoint = new Point (1, 2);
		int thing = 12;
			
		myPoint.setX(2);
		myPoint.setY(3);
			
		System.out.println(Point.maxSizeX);
		
		System.out.println(myPoint);
		
		doSomeStuff(myPoint, 12);
		
		System.out.println(myPoint + "  " + thing);
		
		
	}
	
	public static int doSomeStuff(Point point, int thing)
	{
		point.setX(1);
		point.setY(1);
		thing = 11;
		return 0;
	}
	
	
}

class Point
{
	
	final public static int maxSizeX = 3;
	final public static int maxSizeY = 3;
	final public static int minX = 1;
	final public static int minY = 1;
	
	
	private int x;
	private int y;
	
	
	public Point (int newx, int y)
	{
		this.x = newx;
		this.y = y;
	}
	
	public Point()
	{
		x = 1;
		y = 1;
	}
	
/*	
	public String toString()
	{
		String retString =  "X: " + x + "  : Y: "+ y;
		return retString;
	}
*/	
	
	// mutator for x
	public boolean setX (int newX)
	{
		boolean isError = false;
		if (newX >= minX && newX <= maxSizeX ) 
			x = newX;
		else
			isError =true;
		return isError;
	}
	
	
	// mutator for y
	public boolean setY (int newY)
	{
		boolean isError = false;
		if (newY >= minY && newY <= maxSizeY ) 
			y = newY;
		else
			isError =true;
		return isError;
	}
	
	// accessor for x
	public int getX()
	{
		return x;
	}
	
	// accessor for y
	public int getY()
	{
		return y;
	}
}








