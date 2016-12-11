package b.cars;

public class Car {
	
	private String color;
	private int speed;
	
	// default CTOR
	
	public Car(){
		
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
	}

}
