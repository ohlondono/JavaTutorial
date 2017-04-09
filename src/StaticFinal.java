class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name; //-- this is called Instance Variable
	public static String description; //--> Static variable
	public static int count = 0;
	public int id;
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object if: " + id + ", " + description + ", " +  name);
		/* instance methods can access static variables */
		System.out.println(description);
	}
	
	public static void showInfo() {
		System.out.println("Hello there!");
		/* It won't work because static methods only can access static variables */
		/* System.out.println(name);*/
	}
	
}
public class StaticFinal {
	
	public static void main(String[] args) {
		Thing.description = "Singfeld";
		Thing.showInfo();
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Jerry";
		thing2.name = "George";
		
		System.out.println(thing2.name);

		System.out.println(thing2.description);
		
		thing1.showName();
		thing2.showName();
		/* Other example of static */
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
