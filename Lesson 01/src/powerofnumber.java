import java.util.Scanner;

public class powerofnumber {
public static void main(String[] args) {
	
	int a, b, power = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number and power ");
	
	a = sc.nextInt();
	b = sc.nextInt();
	
	
	for (int i = 0; i < b; i++) {
		power = power * a;
		
	
		
	}
	System.out.println("Power is " + power);
}
}
