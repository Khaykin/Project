package c.exercise;

public class Tar1 {

	public static void main(String[] args) {

		// create and array
		int[] nums = new int[10];
		// define variables for sum and avf
		int sum = 0;
		double avg;

		// populate the array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 101);
			System.out.print(nums[i] + ", ");
			sum = sum + nums[i]; // increment sum
		}

		System.out.println();

		// print
		System.out.println("sum = " + sum);

		// calculate average
		avg = sum / (double) nums.length;
		System.out.println("average = " + avg);

	}
}
