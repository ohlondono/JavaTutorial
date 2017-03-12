/**
 * @author Oscar
 *
 */
public class IfCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loop = 0;
		while (true) {			
			System.out.println("Looping = " + loop);
			if (loop == 5){
				break;
			}
			loop++;
		}

	}

}
