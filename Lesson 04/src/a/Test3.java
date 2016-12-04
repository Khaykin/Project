package a;

public class Test3 {

	public static void main(String[] args) {
		
		// create animal array
		Animal[] animals = new Animal[3];
		// populate with animals
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cow();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
	}
}
