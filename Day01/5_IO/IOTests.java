import java.io.*;
public class IOTests
{
	public static void main (String [] args)
	{
		whatever("in.txt");
	}
	
	public static void whatever(String filename)
	{
		FileReader fileReaderIn;
		BufferedReader fileIn;
		
		
		FileWriter fileWriterOut;
		PrintWriter fileOut;
		String inputLine = "";
		try
		{
			fileReaderIn = new FileReader(filename);
			fileIn = new BufferedReader(fileReaderIn);
			
			fileWriterOut = new FileWriter("out.txt", true);
			fileOut = new PrintWriter(fileWriterOut);

			
			inputLine = fileIn.readLine();
			while (inputLine != null)
			{
				fileOut.print(inputLine);
				System.out.println(inputLine);
				inputLine = fileIn.readLine();
			}
			fileIn.close();
			fileOut.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
	
}











