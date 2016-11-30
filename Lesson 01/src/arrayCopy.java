import java.util.Arrays;

public class arrayCopy {
public static void main(String[] args) {
	int[] arr1 = {2,4,6};
	int[] arr2 = new int[arr1.length+2];
	
	System.arraycopy(arr1, 1, arr2, 1, arr1.length-1);
	System.out.println(Arrays.toString(arr2));
		
	
System.out.println();
}
}
