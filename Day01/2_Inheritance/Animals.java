public class Animals
{
	public static void main(String[] parms)
	{
		Cat fluffy;
		Dog fido;
		
		fluffy = new Cat("Fluffy");
		fido = new Dog("Fido");

		System.out.println(fluffy);
		
		
		//System.out.println("\n" +fido);

		System.out.println();
		fluffy.makeNoise();
		System.out.println();
		fido.makeNoise();
		
		// can be stored in the same array! or arraylist!
		// TODO



        Animal [] zoo = new Animal[2];
        zoo[0] = fluffy;
        zoo[1] = fido;
        
        System.out.println("Printing zoo!!!!");
        for ( int i = 0; i < zoo.length; i++)
        {
            System.out.println(zoo[i]);
        }


		System.out.println("\nProgram completed normally." + 		Animal.num_animals);

	}
}



/*********************************************************************/
/*********************************************************************/

abstract class Animal
{
	public String name;
	public String type;
	
	public static int num_animals = 0;
	
	public Animal ()
	{
		num_animals++;
		System.out.println("In the Super super Class!!!");
	}


	public String toString()
	{
		return "Animal: Type: " +type +"; Name: " +name;
	}
}



abstract class Mammal extends Animal
	{

		public Mammal ()
		{
			System.out.println("In the super class - Mammal");
			
		}
	}


/*********************************************************************/
/*********************************************************************/

class Cat extends Mammal
{
	public Cat (String name)
	{
		System.out.println("In the subclass - cat");
		this.name = name;
		type = "cat";
	}

	public void makeNoise()
	{
		System.out.println("Meow -or hiss!");
	}
	
	public String toString()
	{
		return (super.toString());
	}
}

/*********************************************************************/
/*********************************************************************/

class Dog extends Mammal
{
	public Dog (String name)
	{
		System.out.println("In the subclass - dog");

		this.name = name;
		type = "dog";
	}

	public void makeNoise()
	{
		System.out.println("yap yap yap");
	}
	
	public String toString()
	{
	    return "oh Marmaduke";
	}
}
