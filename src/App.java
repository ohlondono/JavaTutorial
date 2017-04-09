
class Person {
	/* Instance variables (states or data) */
	String name;
	int age;
	
	/* Can contain 
	   1. Data 
	   2. Subroutines (methods)
	 */
}
public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Newman";
		person1.age = 42;

		Person person2 = new Person();
		person2.name = "Kramer";
		person2.age = 38;
		
	}

}
