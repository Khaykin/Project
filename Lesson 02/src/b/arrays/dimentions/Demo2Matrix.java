package b.arrays.dimentions;

public class Demo2Matrix {
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3}, {4,5,6,7}};
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// dont go out of array bounds
		int[] arr = {1,2,3};
		
		System.out.println(arr[3]);
	}

}
