import java.util.ArrayList;

public class ArrayListsEx extends Object
{
	public static void main(String[] parms)
	{
		ArrayList <String> list = new ArrayList <String>();
		
		//ArrayList list = new ArrayList()  ;
		//ArrayList <Object> list = new ArrayList <Object> ArrayList();
		
		
		String string;

		list = new ArrayList  <String>  ();
		list = createList();

		printList(list);
		System.out.println(list);  // note that you can print the entire array list

		System.out.println("\nSearching for value String3, result is " +list.indexOf("String3"));

		System.out.println("\nRemoving element 2");
		list.remove(2);
		printList(list);

		System.out.println("\nAdding String10 in position 3");
		list.add(3, "String10");
		printList(list);

		System.out.println("\nSearching for value String3, result is " +list.indexOf("String3"));
		System.out.println();

		string = (String) list.get(0); // note that a cast is required
		System.out.println("Contents of position 0: " +string);

		System.out.println("\nProgram completed normally.");
	}

	public static ArrayList<String> createList()
	{
		ArrayList <String> list;
		int counter;
		final int NUM_ELEMENTS = 5;
		String value;

		list = new ArrayList <String>();
		for (counter=0; counter<NUM_ELEMENTS; counter++)
		{
			value = "String" +(counter+1);
			list.add(value);
		}
		return list;
	}

	public static void printList(ArrayList<String> list)
	{
		int counter;

		System.out.print("\nList elements: ");
		for (counter=0; counter<list.size(); counter++)
		{
			System.out.print(list.get(counter) +"  ");
		}
		System.out.println();
	}
}