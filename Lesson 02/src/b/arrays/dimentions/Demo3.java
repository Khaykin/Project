package b.arrays.dimentions;

public class Demo3 {

	public static void main(String[] args) {
		
		// create a 2 dim array
		int[][] arr = new int[3][];
		arr[0] = new int[7];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+j;
				System.out.print(arr[i][j] + "  ");
			}
			
			System.out.println();
		}
	}
}
