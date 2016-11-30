package d.switchDemo;

import java.util.Scanner;

public class SwitchHome1 {

	public static void main(String[] args) {

		System.out.println("Enter 2 digit numbers");
		int num1, num2, num3, tmp;

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		System.out.println("Numbers are " + num1 + ", " + num2 + ", " + num3);

		System.out.println("1. Sort number ");
		System.out.println("2. Max number ");
		System.out.println("3. Min number ");
		System.out.println("4. Average ");
		System.out.println("5. Triangle ");

		System.out.print("Enter mode from 1 to 5: ");
		int mode = sc.nextInt();
		sc.close();
if (num1 > num2) {
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}

			if (num2 > num3) {
				tmp = num2;
				num2 = num3;
				num3 = tmp;
			}

			if (num1 > num2) {
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
		switch (mode) {
            
		
		case 1:
			System.out.println("Case 1 : ");

			

			System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
			break;

		case 2:

			System.out.println("Case 2 : ");
			System.out.println("Max number is " + num3);

			//
			// if (num1 > num2) {
			// if (num1 > num3) {
			// System.out.println("Max Number is " + num1);
			//
			// } else if (num2 > num3) {
			// System.out.println("Max Number is " + num2);
			//
			// } else {
			// System.out.println("Max Number is " + num3);
			// }
			//
			// } else if (num2 > num3) {
			// System.out.println("Max Number is " + num2);
			//
			// } else {
			// System.out.println("Max Number is " + num3);
			// }

			break;
		case 3:

			System.out.println("Case 3 : ");
			System.out.println("Min number is " + num1);

			//
			// if (num1 < num2) {
			// if (num1 < num3) {
			// System.out.println("Min Number is " + num1);
			//
			// } else {
			// System.out.println("Min Number is " + num3);
			// }
			//
			// } else if (num2 < num3) {
			// System.out.println("Min Number is " + num2);
			//
			// } else {
			// System.out.println("Min Number is " + num3);
			// }
			// break;

		case 4:
			System.out.println("Case 4 : ");

			System.out.println("Average number is " + (num1 + num2 + num3) / 3.0);
			break;

		case 5:
			System.out.println("Case 5 : ");

			if (num1 + num2 > num3) {
				if (num1 + num3 > num2) {
					if (num2 + num3 > 1) {
						{
							System.out.println("Numbers can make a TRIANGLE");

						}
					}
				} 
			}
			
			else {
				System.out.println("Numbers can't make a triangle");
			}
			break;

		default:
			System.out.println(mode + " is not a valid mode");
		}

	}
}