package animal;

public class Udav  extends Animal {
	public Udav(String name, int age) {
		super(name, age);
	}
    @Override
    public String sayHello() {
    	return "privet bosyaki!";
    }
    @Override
    public String move() {
    	return "shshshshs";
    }
    public String toString() {
    	return "Udav: " + super.toString();
    }
}
