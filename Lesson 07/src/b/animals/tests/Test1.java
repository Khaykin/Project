package b.animals.tests;

import b.animals.abstractClasses.Animal;
import b.animals.concreteClasses.Ant;
import b.animals.concreteClasses.Bat;
import b.animals.concreteClasses.Butterfly;
import b.animals.concreteClasses.Dog;
import b.animals.concreteClasses.Ostrich;
import b.animals.concreteClasses.Sparrow;
import b.animals.interfaces.Flyer;

public class Test1 {
	
	public static void main(String[] args) {
		
		// create an array of animals (references of type Animal)
		Animal[] animals = new Animal[10];
		
		// populate with concrete animals
		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Ostrich();
		animals[3] = new Sparrow();
		animals[4] = new Dog();
		animals[5] = new Ant();
		animals[6] = new Butterfly();
		animals[7] = new Ant();
		animals[8] = new Sparrow();
		animals[9] = new Dog();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			
			if(animals[i] instanceof Flyer) {
				Flyer f = (Flyer) animals[i];
				f.fly();
			}
			
			System.out.println("==============");
		}
		
	}
	
	

}
