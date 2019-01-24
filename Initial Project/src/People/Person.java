package People;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	
	public Person() {
	}
	
	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getjobTitle() {
		return jobTitle;
	}

	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;

	}

	@Override
	public String toString() {
		return "Name: '" + this.name + "', age: '" + this.age + "', Job Title: '" + this.jobTitle + "'";
	}
}
