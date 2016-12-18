package a.inheritance.shapes;

public class Circle extends Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// return 3.14 * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}

}
