package People;

import java.util.ArrayList;

	public class PersonList {
		
		public void addPerson (String name, int age, String jobTitle) {
			Person person = new Person(name, age, jobTitle);
			
			personList.add(person);
		}
	
	ArrayList<Person> personList = new ArrayList<Person>();
	
	
}