package lesson_7;

public class Butterfly extends Insect implements Flyer ,Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a butterfly");

	}

	@Override
	public void takeOff() {
		System.out.println("takeoff like a butterfly");
		
	}

	@Override
	public void land() {
		System.out.println("land  like a butterfly");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("turnlaft like a butterfly");
		
	}

	@Override
	public void turnRight() {
		System.out.println("turnright like a butterfly");
		
	}

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
		
	}

}
