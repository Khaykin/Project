package c.inheritance;

public class Test1 {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("David");
		Employee e = new Employee();
		e.setName("avi");

		// we use polymorphism to enable methods to get many types
		printPersonName(p);
		printPersonName(e);

		System.out.println(e.getSalary());

		// polymorphism
		p = e;
		// System.out.println(p.getSalary());

	}

	public static void printPersonName(Person p) {
		System.out.println(p.getName());
	}
}
