package b.arrays;

public class Demo3 {

	public static void main(String[] args) {
		double[] arr = new double[5];
		
		arr[0] = Math.random()*11;
		arr[1] = 88.3;
		arr[2] = 9.7;
		arr[3] = 3.8;
		arr[4] = 4.32;
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
