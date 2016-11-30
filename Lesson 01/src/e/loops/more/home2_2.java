package e.loops.more;

import java.util.Scanner;

public class home2_2 {

		public static void main(String[] args) {
		double min = 0, max = 0;
		

		
		for (int i = 1; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter a number: ");
			int a = sc.nextInt();
			if (a > max) {
				max = a;
			}
			else if (a < min) {
				min = a;
				
			} 
		
		}
		System.out.println("Max is " + max + "Min is " + min);
	}
	}