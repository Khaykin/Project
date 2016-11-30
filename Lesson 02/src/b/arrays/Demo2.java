package b.arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			// create random value
			int r = (int)(Math.random()*11);
			// insert the value to the array
			arr[i] = r;
			//print
			System.out.println(arr[i]);
		}
	}
}
