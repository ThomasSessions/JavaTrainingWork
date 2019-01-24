package JavaTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJava {
/*
	@Test
	public void shouldReturnHelloWorld() {

		Person thomas = new Person();
		assertEquals("Hello World", thomas.helloWorld());
	}

	@Test
	public void shouldReturnThomas() {
		Person person = new Person();
		assertEquals("Hello Thomas", person.hello("Thomas"));
	}

	@Test
	public void shouldReturnNumberOfPersons() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();

		assertEquals(7, Person.numberOfPersons());
	}

	@Test
	public void usingBooleans() {
		boolean monday = true;
		boolean raining = true;
		boolean friday = true;
		boolean sunny = false;

		if (monday && raining) {
			drinkBeer();
		} else if ((monday && sunny) || (friday && raining)) {
			drinkBeer();
		} else {
			drinkMilk();
		}
	}

	private void drinkMilk() {
		System.out.println("Milk Time");
	}

	private void drinkBeer() {
		System.out.println("Pint time");

	}

	@Test
	public void usingBooleansTwo() {
		int J = 4;
		int K = 10;

		if (J > K) {
			J++;
			System.out.println(J);
		} else {
			kingK();

		}
	}

	private void kingK() {
		System.out.println("King K is back baby");

	}
  
	@Test
	public void shouldReturnNumberOfPersonsInLoop() {
		for(int i=0;i<4;i++) {
			new Person();
		}
		assertEquals(4, Person.numberOfPersons());
		
		int j = 0;
		while(j < 4) {
			new Person();
			j++;
		}
		assertEquals(8, Person.numberOfPersons());
		
		j = 0;
		do {
			new Person();
			j++;
		}while(j<4);
		assertEquals(12, Person.numberOfPersons());
		}
 */
	@Test
	public void demonstrateArrays() {
		
		Person[] persons = new Person[4];
		for(int i=0;i<4;i++) {
			persons[i] = new Person();
			persons[i].helloWorld();
		}
		
		for(Person person : persons) {
			person.helloWorld();
		}
		
	}
	
	
	
}