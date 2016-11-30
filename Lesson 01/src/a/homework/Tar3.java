package a.homework;

import java.util.Scanner;

public class Tar3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter a 2 digit number: ");
		int a = sc.nextInt();
		
		int dig1 = a%10;
		int dig2 = a/10;
		
		if(dig1!=6) {
			if(dig2!=6){
				System.out.println(a + " has no six");
			}
		}else{
			System.out.println(a + " contains 6");
		}


		sc.close();
	}

}
