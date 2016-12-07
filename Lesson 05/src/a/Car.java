package a;

public class Car {

	private String color;
	private String model;
	private int speed;

	public Car(String color, String model, int speed) {
		super();
		this.color = color;
		this.model = model;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelarate() {
		speed += 5;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", speed=" + speed + "]";
	}
	
	

}
