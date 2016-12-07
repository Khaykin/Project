package a;

public class TestPerson {

	public static void main(String[] args) {

		// create an object
		Person p = new Person(111, "Avi", -25);

		// print
		System.out.println("person [id=" + p.getId() + ", name=" + p.getName() + ", age=" + p.getAge() + "]");

		// print
		p.setAge(45);
		System.out.println("person [id=" + p.getId() + ", name=" + p.getName() + ", age=" + p.getAge() + "]");
	}
}
