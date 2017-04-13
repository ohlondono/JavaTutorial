
public class Inheritance {

	public static void main(String[] args) {
		MyMachine machine1 = new MyMachine();
		
		machine1.start();
		machine1.stop();
				
		Car car1 = new Car();
		
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();
	}

}
