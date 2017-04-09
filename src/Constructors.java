class Machine {
	String name;
	int code;
	public Machine() {
		/* Calling other constructor */
		this("Walle", 0);
		System.out.println("Constructing Machine!");
//		name = "Walle";
	
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running");
//		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Running constructor three");
		this.name = name;
		this.code = code;
	}
}
public class Constructors {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("R2D2");
		Machine machine3 = new Machine("C3P0",  7);
	}

}
