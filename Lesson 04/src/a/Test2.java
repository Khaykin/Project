package a;

public class Test2 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		// use the method
		operateAnimal(animal);
		operateAnimal(cat);
		operateAnimal(dog);

	}

	// define a method
	public static void operateAnimal(Animal animal) {
		animal.speak();
	}
}
