package Testing;

import java.util.jar.Attributes.Name;

public class Person {
private static int personCounter;



 @SuppressWarnings("unused")
private Name personName;

// Instance variable

	public Person(Name personName) {
		this.personName = personName;
	}
	
	public Person() {
		personCounter++;
		// Default constructor 
	}

	public String helloWorld() {
		return "Hello World"; // Instance method
	}

	public String hello(String name) {
		return "Hello " + name;
		
		
		
	}

	public static int numberOfPersons() {
		return personCounter;
	}
}
