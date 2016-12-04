package a;

public class Test {

	public static void main(String[] args) {
		
		Animal a = new Cat();
		a.speak();
		
		System.out.println();
		
		// create animal objects
		Dog dog = new Dog();
		Cat cat = new Cat();
		// use the method
		operateAnimal(cat);
		operateAnimal(dog);
	}
	
	// define a method
	public static void operateAnimal(Animal animal) {
		animal.speak();
	}
}
