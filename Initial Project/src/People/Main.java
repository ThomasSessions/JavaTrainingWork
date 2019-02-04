package People;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Person personalInformationOne = new Person("Thomas Sessions", 22, "Trainee");
		Person personalInformationTwo = new Person("William Thain", 21, "Full stack developer");
		Person personalInformationThree = new Person("Sam Oswick", 22, "Sales staff");

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(personalInformationOne);
		personList.add(personalInformationTwo);
		personList.add(personalInformationThree);

		for (Person i : personList) {
			System.out.println(i);
		}
	

	}
}
