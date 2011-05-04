

import java.io.*;
import java.math.*;


public class SimpleObject {
	public static void main(String args[])
	{
			
        Person p1 = new Person("Mal"); 
        Person p2 = new Person("Jayne"); 
        System.out.println(p1 == p2); // What is the output of this line? _________________
        
        p1 = new Person("River"); 
        p2 = new Person("River"); 
        System.out.println(p1 == p2); // What is the output of this line? _________________
        
        p1 = new Person("Zoe"); 
        p2 = new Person("Wash"); 
        p2 = p1; 
        System.out.println(p1 == p2); // What is the output of this line? _________________
        
        p1 = new Person("Kaylee"); 
        p2 = new Person("Inara"); p2 = p1.clone(); 
        System.out.println(p1 == p2); // What is the output of this line? _________________
		
		System.out.println("Done");
	}
	

}
class Person {

    private String name;
    public Person(String name) {

        this.name = name;
    }
    public String toString () {

        return name;
    }
    public Person clone() {

        return new Person(name);
    }
    public boolean equals(Person p2) {

        boolean same = false; if (name.equals(p2.toString() ))
            same = true; return same;
    }
    
}