package a.homework;

import java.util.Scanner;

public class Tar7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first digit: ");
		int a = sc.nextInt();

		System.out.print("enter second digit: ");
		int b = sc.nextInt();

		System.out.print("enter third digit: ");
		int c = sc.nextInt();

		sc.close(); // closing scanner

		System.out.println(a + ", " + b + ", " + c);

		if (a < 10 && b < 10 && c < 10) {
			int n = a*100+b*10+c;
			System.out.println(n);
		}else{
			System.out.println("error - all input must be digits");
		}
	}
}
