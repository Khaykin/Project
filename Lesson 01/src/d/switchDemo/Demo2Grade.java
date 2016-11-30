package d.switchDemo;

public class Demo2Grade {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 15);

		System.out.println(grade);

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("πλωμ");
			break;
		case 6:
		case 7:
			System.out.println("πλωμ");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("πλωμ");
			break;

		default:
			break;
		}
	}

}
