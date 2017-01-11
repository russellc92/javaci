package WorkingWithFiles;

public class Person {
		
	String name;
	String occupation;
	int age;
	
	public Person(int pAge, String pName, String pOccupation)
	{
		this.age = pAge;
		this.name = pName;
		this.occupation = pOccupation;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getOccupation() {
		return occupation;
	}
	public int getAge() {
		return age;
	}	
}
