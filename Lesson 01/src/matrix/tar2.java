package matrix;

public class tar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int max = 0, ind = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + ",");
			if (arr[i] > max) {
				max = arr[i];
				ind = i;
				// System.out.println("max =" + max + ", index" + ind);
			}
		}
		System.out.println();
		System.out.println("max =" + max + ", index" + ind);
	}
}
