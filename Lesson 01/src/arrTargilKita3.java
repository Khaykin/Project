
public class arrTargilKita3 {

	public static void main(String[] args) {
	
	int[][] matrix = new int [4][3];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] = (int)(Math.random()*11);
		
			System.out.print(matrix[i][j] + "\t");
			
		}
		System.out.println();
	}		
}
}
