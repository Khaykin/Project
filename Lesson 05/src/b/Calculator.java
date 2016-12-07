package b;

public class Calculator {

	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int sum = c.add(5, 8);
		System.out.println(sum);
		c.sayHello();
	}
}
