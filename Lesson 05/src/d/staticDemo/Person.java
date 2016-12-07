package d.staticDemo;

public class Person {

	// fields
	// static - class variables
	private static int counter;
	
	// attributes - instance variables
	public final int id;
	private String name;
	private int age;
	

	public Person(String name, int age) {
		counter++;
		id = counter;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
