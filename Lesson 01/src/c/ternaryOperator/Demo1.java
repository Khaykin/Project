package c.ternaryOperator;

public class Demo1 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a + ", " + b);

		int max = a > b ? a : b; // ternary operator

		System.out.println("max = " + max);

	}
}
