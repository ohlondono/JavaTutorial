import java.util.Scanner;

/**
 * @author Oscar
 *
 */
public class SwitchCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a command: ");
		String text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Machine Started!");
			break;
		case "stop":
			System.out.println("Machine Stopped!");
			break;
		default:
			break;
		}

	}

}
