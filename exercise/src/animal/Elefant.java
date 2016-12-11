package animal;

public class Elefant extends Animal {
	public Elefant(String name, int age) {
		super(name, age);
	}
    @Override
    public String sayHello() {
    	return "Uf Uf";
    }
    @Override
    public String move() {
    	return "Bum Bum BUm";
    }
    public String toString() {
    	return "Elefant: " + super.toString();
    }
}
