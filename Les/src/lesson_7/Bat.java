package lesson_7;

public class Bat extends Mamal implements Flyer {

	@Override
	public void speak() {
		System.out.println("BATBAT");
		
	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
		
	}

	@Override
	public void takeOff() {
		System.out.println("takeoff like a bat");
		
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
		
	}

	public void turnRight() {
		System.out.println("turnright like a bat");
		
	}

	public void turnLeft() {
		System.out.println("turnleft like a bat");
		
	} 
	
	

}
