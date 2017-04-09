
class Person {
	/* Instance variables (states or data) */
	String name;
	int age;
	
	/* Can contain 
	   1. Data 
	   2. Subroutines (methods)
	 */
	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old." );
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
	
	void sayMyName(){
		System.out.println("My name is " + name + "." );
	}
}
public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Newman";
		person1.age = 42;
		person1.speak();
		person1.sayMyName();
		
		Person person2 = new Person();
		person2.name = "Kramer";
		person2.age = 38;
		person2.speak();
		person2.sayHello();
		System.out.println(person2.name);
	}

}
