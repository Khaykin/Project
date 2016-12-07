package c;

import a.Person;

public class Employee extends Person {
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//overriding a method from super class
	@Override
	public String getName() {
		return "employee: " + super.getName();
	}

	@Override
	public String toString() {
		return getName() + ", " + getSalary();
	}
	
	

}
