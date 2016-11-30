package e.loops.more;

public class Boom7 {

	public static void main(String[] args) {

		// put a lable on this loop so we can break or continue it from a nested
		// loop
		lbl: for (int i = 1; i <= 100; i++) {

			// check if the number divides by 7
			if (i % 7 == 0) {
				System.out.println("boom");
				continue; // break the current iteration
			}

			// check if the number contains 7

			int n = i;

			while (n != 0) {
				if (n % 10 == 7) {
					System.out.println("boom");
					continue lbl;
				} else {
					n = n / 10;
				}
			}

			System.out.println(i);

		}
	}
}
