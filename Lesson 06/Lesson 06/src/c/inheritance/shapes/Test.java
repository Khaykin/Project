package c.inheritance.shapes;

public class Test {

	public static void main(String[] args) {
		Shape s = new Shape(); // create an object
		s.setColor("Red"); // set the color
		System.out.println(s.getColor()); // print color
		System.out.println(s.getArea()); // print area
		
		System.out.println("========");
		
		Rectanle r = new Rectanle();
		r.setLength(10);
		r.setWidth(5);
		r.setColor("Blue");
		System.out.println(r.getColor());
		System.out.println(r.getArea());
		
		
	}
}
