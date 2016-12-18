package a.inheritance.shapes;

// abstract class
public abstract class Shape {

	private String color;

	// abstract method
	public abstract double getArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
