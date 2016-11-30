package b.arrays.dimentions;

public class Demo1Matrix {

	public static void main(String[] args) {

		// create a matrix
		int[][] matrix = new int[4][3];

		for (int i = 0; i < matrix.length; i++) { // iterate arrays
			for (int j = 0; j < matrix[i].length; j++) { // iterate elements
				// populate with data
				matrix[i][j] = (int) (Math.random() * 11);
				// print
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
