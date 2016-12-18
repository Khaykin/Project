package b.animals.tests;

import b.animals.abstractClasses.Animal;
import b.animals.concreteClasses.Bat;
import b.animals.concreteClasses.Dog;
import b.animals.interfaces.Flyer;

public class Test2 {

	public static void main(String[] args) {
		
		Animal a = new Bat();
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Flyer);
		System.out.println(a instanceof Bat);
		
		System.out.println("===");
		a = new Dog();
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Flyer);
		System.out.println(a instanceof Bat);
		
	}
}
