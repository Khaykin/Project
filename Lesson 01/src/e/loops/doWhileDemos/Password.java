package e.loops.doWhileDemos;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		int pass = 123;
		int input = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("enter password: ");
			input = sc.nextInt();
		} while (input != pass);

		System.out.println("you are logged in");

		sc.close();
	}

}
