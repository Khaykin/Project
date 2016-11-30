package e.loops.whileDemos;

public class Demo2 {

	public static void main(String[] args) {

		int c = 1; // counter
		int sum = 0; // variable for sum

		while (c <= 10) {
			// create random number
			int r = (int) (Math.random() * 11);
			// print
			System.out.print(r + ", ");
			// add to the sum variable
			sum = sum + r;
			// increment counter
			c++;
		}

		System.out.println("\nsum = " + sum);
		double avg = sum / 10D;
		System.out.println("avg = " + avg);

	}
}
