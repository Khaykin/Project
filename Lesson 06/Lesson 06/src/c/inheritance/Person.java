package c.inheritance;

public class Person {

	// fields
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}else{
			System.out.println(age  + " is an illegal age value");
		}
	}
	
	public void growUp() {
		this.age++;
	}

}
