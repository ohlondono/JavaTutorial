import java.util.Scanner;

/**
 * @author Oscar
 *
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Ask the user to enter a line */
		System.out.println("Enter a text line please: ");
		
		/* Wait for the user to enter the line*/
		String line = input.nextLine();
		
		/*Tell the user what he entered*/
		System.out.println("Your Line is: "+ line);
		
		System.out.println("Enter an integer now: ");
		int yourInt = input.nextInt();
		System.out.println("Your int is: "+ yourInt);
		
		System.out.println("Enter a Double now: ");
		double yourDouble = input.nextDouble();
		System.out.println("Your int is: "+ yourDouble);
	}

}
