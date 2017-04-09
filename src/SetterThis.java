class Frog {
	String name;
	int age;
	
	public void setName(String name) {
		/* Use "this" for referring to an attribute for the object this method is in  */
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);		
	}
}
public class SetterThis {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
//		frog1.name = "Rene";
//		frog1.age = 5;
		frog1.setName("Rana Rene");
		frog1.setAge(5);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
	}

}
