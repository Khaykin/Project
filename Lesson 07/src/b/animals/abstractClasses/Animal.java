package b.animals.abstractClasses;

public abstract class Animal {

	// attribute
	private int age;

	// concrete methods
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// abstract methods
	public abstract void speak();

}
