package b.complexConditions;

public class LeapYear {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 4001);
		System.out.println(year);

		// check if leap year

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}

}
