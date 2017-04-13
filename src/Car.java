
public class Car extends MyMachine {
	
	@Override
	public void start() {		 
		System.out.println("Car started");
	}

	public void wipeWindShield(){
		System.out.println("Wiping wind shiled");
	}
	
	public void showInfo(){
		System.out.println("Car name: " + name);
	}
}
