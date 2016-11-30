import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		int[] arr1 = {2,4,6};
		int[] arr2 = new int[5];
		
		System.arraycopy(arr1, 1, arr2, 1, 2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
