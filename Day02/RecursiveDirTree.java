import java.io.*;
public class RecursiveDirTree
{
	public static void main (String [] args)
	{
		//visitAllDirsAndFiles(new File("/Users/rob/scratch"));
		visitAllDirsAndFiles(new File("/Users/rob/projects"));
	}
	// Process all files and directories under dir
	public static void visitAllDirsAndFiles(File dir) 
	{
		System.out.println(dir);
		
		if (dir.isDirectory()) 
		{
			String[] children = dir.list();
			for (int i=0; i<children.length; i++) 
			{
				visitAllDirsAndFiles(new File(dir, children[i]));
			}
		}
	}
	
	// Process only directories under dir
	public static void visitAllDirs(File dir) 
	{
		if (dir.isDirectory()) 
		{
			System.out.println(dir);
			
			String[] children = dir.list();
			for (int i=0; i<children.length; i++) 
			{
				visitAllDirs(new File(dir, children[i]));
			}
		}
	}
	
	// Process only files under dir
	public static void visitAllFiles(File dir) 
	{
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i=0; i<children.length; i++) 
			{
				visitAllFiles(new File(dir, children[i]));
			}
		} else {
			System.out.println(dir);
		}
	}
	
}