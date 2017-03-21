
public class ArrayMulti {

	public static void main(String[] args) {
	
		int[][] grid = {
			{1, 5, 123},
			{3, 7},
			{2, 4, 6, 8} 
		};
		
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		
		texts[1][0] = "Hello Newman";
		
		System.out.println(texts[1][0]);
		
		for (int row = 0; row < grid.length; row ++){
			for (int col = 0; col <grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		
		words[0] = new String[3];
		
		words[0][1] = "Hello... Newman";
		System.out.println(words[0][1]);
	}

}
