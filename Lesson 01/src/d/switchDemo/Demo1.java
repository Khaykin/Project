package d.switchDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// using scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("enter mode 1 - 2 - 3: ");
		int mode = sc.nextInt();
		sc.close();

		// using random
		// int mode = (int) (Math.random()*3)+1;

		switch (mode) {
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("OFF");
			break;
		case 3:
			System.out.println("STAND BY");
			break;
			default:
				System.out.println(mode + " is not a valid mode");
		}

		System.out.println("bye");

	}

}
