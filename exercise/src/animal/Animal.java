package animal;

public abstract class Animal {
	//private fields
	private String name;
	private int age;
	//constructor
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */

	//setters and getters for name and age
	public void setName(String name) {this.name = name;  }
	public String getName() {return name;  }
	public void setAge(int age) { this.age = age; }
	public int getAge() { return age;}
	//abstract methods, the animal class doesn't know 
	//how to implement these. We need some concrete
	//instantiation
	public abstract String sayHello();
	
	public abstract String move();
	
	public String toString(){
		return "Name: " + name + " Age: " + age;
	}
	
}