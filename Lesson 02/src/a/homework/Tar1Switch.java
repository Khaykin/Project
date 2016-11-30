package a.homework;

import java.util.Scanner;

public class Tar1Switch {

	public static void main(String[] args) {

		// create a scanner for input
		Scanner sc = new Scanner(System.in);
		// prompt user for input
		System.out.print("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// print the input
		System.out.println("the numbers are: " + a + ", " + b + ", " + c);

		// shoe menu
		System.out.println("\nWhat do you want to do?");
		System.out.println("Sort numbers ............ 1");
		System.out.println("Show max ................ 2");
		System.out.println("Show minimum ............ 3");
		System.out.println("Show average ............ 4");
		System.out.println("Can it be a triangle? ... 5");
		System.out.print("Your choice: ");

		// get input from user - user choice
		int command = sc.nextInt();

		// respond to the user's choice
		switch (command) {
		case 1:
			if (a < b && a < c) {
				System.out.println(a);
				if (b < c) {
					System.out.println(b);
					System.out.println(c);
				} else {
					System.out.println(c);
					System.out.println(b);
				}
			} else if (b < a && b < c) {
				System.out.println(b);
				if (a < c) {
					System.out.println(a);
					System.out.println(c);
				} else {
					System.out.println(c);
					System.out.println(a);
				}

			} else {
				System.out.println(c);
				if (a < b) {
					System.out.println(a);
					System.out.println(b);
				} else {
					System.out.println(b);
					System.out.println(a);
				}

			}
			break;
		case 2:
			System.out.print("max is ");
			if (a > b) {
				if (a > c) {
					System.out.println(a);
				} else {
					System.out.println(c);
				}
			} else {
				if (b > c) {
					System.out.println(b);
				} else {
					System.out.println(c);
				}

			}

		default:
			break;
		}

		sc.close();
	}

}
