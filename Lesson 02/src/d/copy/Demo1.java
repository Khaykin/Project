package d.copy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 3, 6, 7 };
		int[] arr2 = new int[arr1.length];
		
		// we can print an array this way
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// copy elements
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}
}
