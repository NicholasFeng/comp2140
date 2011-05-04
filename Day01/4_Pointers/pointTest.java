/*
 * An example to show how to access instance variables (instantiatedObject.variable) an
 * Class variables (ClassName.variable)
 * Also makes use of the toString method
 * beginning of the Accessor/Mutator methods are also in this example
 */
public class pointTest
{
	public static void main (String [] args)
	{
		Point myPoint = new Point (1, 2);
		Point mySecondPoint = new Point(2, 3);
		
		//myPoint.x = 2;
		//myPoint.y = 3;
		
		mySecondPoint.setX( 100 );
//		mySecondPoint.setY( 100 );
		
		//System.out.println(Point.maxSizeX);
		
		System.out.println(mySecondPoint.toString());
		
		
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
	
	// toString method is called when we try to print the object.
	// Try running the code with out this method and see what happens
	public String toString()
	{
		String retString =  "X: " + x + "  : Y: "+ y;
		return retString;
	}
	
	
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
	
	//accessor for x
	public int getX()
	{
		return x;
	}
}








