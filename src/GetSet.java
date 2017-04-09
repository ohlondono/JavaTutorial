class ThisPerson {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class GetSet {

	public static void main(String[] args) {
		ThisPerson person1 = new ThisPerson();
		person1.name = "Jerry Singfeld";
		person1.age = 37;
//		person1.speak();
		
		int yearsLeft = person1.calculateYearsToRetirement();
		System.out.println("Years till retiremente " + yearsLeft);
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}

}
