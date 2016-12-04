package b;

public class StackAndHeap {

	public static void main(String[] args) {

		System.out.println("start");

		int x = 5;
		int y = 10;
		Person p = new Person("Avi", 20);
		method1();

	}

	public static void method1() {

		int a = 1;
		int b = 2;
		method2();

	}

	public static void method2() {
		int x = 500;
		int y = 1000;

	}
}
