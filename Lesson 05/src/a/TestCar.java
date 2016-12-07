package a;

public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car("Red", "Audi", 100);
		Car c2 = new Car("White", "Toyota", 10);
		c1 = null;
		// System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c2);
	}
}
