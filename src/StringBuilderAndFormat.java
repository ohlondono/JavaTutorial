
public class StringBuilderAndFormat {

	public static void main(String[] args) {
		/* Less efficient */
		String info = "";
		
		info += "My name is Kramer.";
		info += " ";
		info += "I'm an actor";
		
		System.out.println(info);
		
		/* More efficient */
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Elaine");
		sb.append(" ");
		sb.append("I'm an actress");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is George")
		 .append(" ")
		 .append("I'm an architect");
		
		System.out.println(s.toString());
		
		/* FORMATTING STRINGS */
		/* note that here it is used print instead println */
		System.out.print("This is the first text.\tThis is the secont text\rThis is the last text");
		System.out.println(" - Some more text");
		
		/* And using parameters with printf */
		System.out.printf("The cost is %d; and the qty is %d\n", 7, 95);

		/* Using a number in %d e.g %10d,  means that the value is going to be 10 characters long 
		   and is going to be filled with spaces at the LEFT side */
		for (int i = 0; i < 20; i++){
			System.out.printf("The value is %2d: some text\n", i);
		}
		
		/* Using a number in %d e.g %-10d,  means that the value is going to be 10 characters long 
		   and is going to be filled with spaces at the RIGHT side */
		for (int i = 0; i < 20; i++){
			System.out.printf("The value is %-2d: some text\n", i);
		}
		/* Formatting floatig point */
		System.out.printf("The cost is %.2f\n", 123.6648);
		System.out.printf("The cost is %2.3f\n", 123.6);
		System.out.printf("The cost is %10.2f\n", 123.6698); // --> Result is "     123.67"
		System.out.printf("The cost is %-7.2f\n", 123.6698); // --> Result is "123.67 "
	}

}
