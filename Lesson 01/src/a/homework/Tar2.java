package a.homework;

import java.util.Scanner;

public class Tar2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter first number: ");
		int a = sc.nextInt();

		System.out.print("enter second number: ");
		int b = sc.nextInt();

		sc.close();

		System.out.println("a = " + a + ", b = " + b);

		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("equals");
		}
	}

}
