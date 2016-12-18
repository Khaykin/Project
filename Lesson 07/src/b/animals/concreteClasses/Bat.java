package b.animals.concreteClasses;

import b.animals.abstractClasses.Mamal;
import b.animals.interfaces.SuperFlyer;

public class Bat extends Mamal implements SuperFlyer {

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a bat");

	}

	@Override
	public void land() {
		System.out.println("land like a bat");

	}

	@Override
	public void turnRight() {
		System.out.println("turnRight like a bat");

	}

	@Override
	public void turnLeft() {
		System.out.println("turnLeft like a bat");

	}

}
