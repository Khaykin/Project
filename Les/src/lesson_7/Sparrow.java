package lesson_7;

public class Sparrow extends Bird  implements Flyer ,Navigator {
	
	@Override
	public void speak() {
		System.out.println("speak like a sparrow");

	}

	@Override
	public void turnLeft() {
		System.out.println("turnleft like a sparrow");
		
	}

	@Override
	public void turnRight() {
		System.out.println("turnright like a sparrow");
		
	}

	@Override
	public void fly() {
		System.out.println("fly as a sparrow");
		
	}

	@Override
	public void takeOff() {
		System.out.println("takeoff like a sparrow");
		
	}

	@Override
	public void land() {
		System.out.println("land like a sparrow");
		
	}
	
	
	
	

}
