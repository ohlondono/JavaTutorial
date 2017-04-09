class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumpint " + height );
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction );
	}
}
public class EncapsuleSet {

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		robot1.speak("Hello Newman!");
		robot1.jump(7);
		robot1.move("North", 14);
		
		String greeting = "Hello Jerry!";
		
		robot1.speak(greeting);
		
		int thisHeight = 8;
		robot1.jump(thisHeight);
	}

}
