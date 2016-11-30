package b.arrays.dimentions;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size: ");
		int length = sc.nextInt();
		sc.close();
		
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
