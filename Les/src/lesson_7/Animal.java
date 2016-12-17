package lesson_7;

public  abstract class Animal {
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void speak();
	
private static int animalCounter() {

		int animalCounter = 0;
		return animalCounter++;
	}
    public static int getAnimalCounter() {
		return animalCounter();
	}
	
}	





