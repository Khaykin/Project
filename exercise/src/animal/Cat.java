package animal;

public class Cat extends Animal {
	
	/**
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age, boolean fluffy) {
		super(name, age);
	}

	//public Cat(String name, int age, boolean fluffy) {
	//	super(name, age);
	//	this.fluffy = fluffy;
	//}

	
	@Override
	public String sayHello() {
		return "Oh. ept it's you! Hey";
	}
	
	@Override
	public String move() {
		return "If you insist....";
	}
	
    //public boolean isFluffy() {
	//	return fluffy;
	//}
	
    //public Cat(String name, int age, boolean fluffy) {
	//	super(name, age);
	//	this.fluffy = fluffy;
	//}
	public String toString() {
    	return "Cat: " + super.toString();
		
	}
}
