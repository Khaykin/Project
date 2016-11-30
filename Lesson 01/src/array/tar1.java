package array;

public class tar1 {

	public static void main(String[] args) {
		// create array
		int[] arr = new int[10];
		// populate the array

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 11);
			System.out.println(arr[r] + ",");
		}
	}
}
