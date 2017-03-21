
public class ArraysOne {

	public static void main(String[] args) {
		int[] values;
		values = new int[3];
		values[0] = 10;
		values[1] = 20;
		values[2] = 40;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
		int[] numbers = {1, 3, 5};
		
		for (int i = 0; i < numbers.length; i ++){
			System.out.println(numbers[i]);
		}
	}

}
