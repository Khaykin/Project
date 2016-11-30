package matrix;

public class tar1 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int r = (int) (Math.random() * 11);
				matrix[i][j] = r;
				System.out.print(matrix[i][j] + "\t");

			}
			System.out.println();
		}

	}

}
