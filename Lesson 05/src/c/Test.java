package c;

public class Test {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("David");
		System.out.println(emp.getName());
		
		emp.setSalary(5000);
		System.out.println(emp.getSalary());
		
		System.out.println(emp.toString());
	}

}
