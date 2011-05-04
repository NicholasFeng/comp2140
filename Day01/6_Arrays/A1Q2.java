/**
 * COMP 1020 Section A01
 * Instructor:   Robert Guderian
 * Assignment:   Assignment 1, question 2
 * @author       Robert Guderian
 * @version      June 1, 2009
 */
 
import java.util.ArrayList;

public class A1Q2
{
	public static void main (String [] args)
	{
		Conversion [] conversions = new Conversion [6];
		
		//ArrayList conversions = new ArrayList();
		// ArrayList is size 0- currently;
		
		//conversions.add(new Conversion("USD", 1));
		
		conversions[0] = new Conversion("USD", 1);
		conversions[1] = new Conversion("GBP", 0.56856);
		conversions[2] = new Conversion("Euros", 0.63169);
		conversions[3] = new Conversion("AUD", 1.13097);
		conversions[4] = new Conversion("JPY", 83.5689);
		
		conversions[5] = new Conversion("Robland", 0.00003);
				
		printTable(conversions);
		convertToAll(conversions, 10);
		convertFromAll(conversions, 10);
		
		System.out.println( Conversion.countofBlah() );
		
				
	}
	
	
	/**
	 * Prints a Table of all the conversion factors.
	 *
	 * @param conversions  An Array of conversion objects to print
	 * @return             -void-
	 */
	public static void printTable (Conversion [] conversions)
	{
		for (int i = 0; i < conversions.length; i++)
			System.out.println(conversions[i]);
		System.out.println();

	}
	
	/**
	 * Describe the purpose of the method. Clearly.
	 *
	 * @param conversions     Array of conversion object to convert the second parameter to
	 * @param CAD			  The value to convert to the foriegn currencies
	 * @return                -void-
	 */
	public static void convertToAll(Conversion [] conversions, double CAD)
	{
		System.out.println("Convert From Canadian Dollars to Foreign Currency");
		for (int i = 0; i < conversions.length; i++)
			System.out.println (CAD + " CAD is " + conversions[i].convertTo(CAD) + " " + conversions[i].getName() );
		System.out.println();
	}
	
	/**
	 * Concert an amount from a foreign currency CAD
	 *
	 * @param conversions     Array of conversion object to convert the second parameter to
	 * @param CAD			  The value to convert to the foriegn currencies
	 * @return                -void-
	 */
	public static void convertFromAll(Conversion [] conversions, double othercurrency)
	{
		System.out.println("Convert From Foreign Currency to Canadian Dollars");
		for (int i = 0; i < conversions.length; i++)
			System.out.println (othercurrency + " " + conversions[i].getName() + " is " + conversions[i].convertFrom(othercurrency) + "  CAD" );
		System.out.println();
	}
}




class Conversion
{
	private String currencyName;
	private double conversionFactor;
	
	
	private static int countConversionTypes = 0;
	
	
	
	public static int countofBlah()
	{
		return countConversionTypes;
	}
	
	/**
	 * Constuctor for class conversion
	 *
	 * @param currencyName     the currency's name
	 * @param conversionFactor the multipiler to convert CAD to this currency
	 */
	
	
	public Conversion (String currencyName, double conversionFactor)
	{
		this.currencyName = currencyName;
		this.conversionFactor = conversionFactor;
		
		countConversionTypes++;
	}
	
	
	/**
	 * Rounds a double to less than 2 decimal places and returns that in a string
	 *
	 * @param in  the number to make into a string
     * @return    the value rounded in a string
	 */
	private String roundDoubleToString(double in)
	{
		return  "" + ((int)((in+0.005)*100.0) / (float)100.0 );
	}
	
	
	/**
	 * converts Canadian Dollars to this currency
	 *
	 * @param CAD      The amount to convert
	 * @return         The value of CAD in this currency in a string
	 */
	public String convertTo(double CAD)
	{
		return roundDoubleToString(CAD * conversionFactor);
	}
	
	
	/**
	 * Converts this currency into CAD
	 *
	 * @param othercurrency   the amount we're converting to CAD
	 *
	 * @return                the value of the other currency in CAD rounded to less than 2 decimal places
	 */
	public String convertFrom(double othercurrency)
	{
		return roundDoubleToString(othercurrency / conversionFactor);
	}
	
	/**
	 * Gets the name of this currency - an accessor
	 *
	 * @return                The name of this currency
	 */
	public String getName()
	{
		return currencyName;
	}
	
	/**
	 * Returns a string of the name of the currency and it's conversion factor
	 *
	 * @return          A formatted string of the name and conversion factor
	 */
	public String toString()
	{
		return ("Currency: " + currencyName + "\tConversion Factor: " + conversionFactor);
	}
}
