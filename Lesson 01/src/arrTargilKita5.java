
public class arrTargilKita5 {
	public static void main(String[] args) {
		int[] arr = new int[50];
		int sum = 0, index = 0, max = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + " , ");
			if (arr[i] > max) {
				max = arr[i];
				index = i;

			}
			
		}
		System.out.println();
		System.out.println("Max number in array is " + max + " Index is " + index);
	}
}
