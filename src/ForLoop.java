/**
 * @author Oscar
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i <  10; i++ ) {
			System.out.println("Hello " + i);
		} 
		/* other use of print */
		for (int i = 0; i <  10; i++ ) {
			/* use printf to send a formatted parameter to be printed and use \n to enter a new line */ 
			System.out.printf("This is the item %d\n", i);
		} 
	}

}
