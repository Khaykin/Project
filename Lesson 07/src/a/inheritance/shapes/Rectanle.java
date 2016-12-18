package a.inheritance.shapes;

public class Rectanle extends Shape implements Polygon {

	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public int getNumOfCorners() {
		return 4;
	}


}
