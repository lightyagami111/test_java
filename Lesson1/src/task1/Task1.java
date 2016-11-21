package task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Въведете А: " );
		double a = scanner.nextDouble();
		
		System.out.print("Въведете B " );
		double b = scanner.nextDouble();
		
		System.out.print("Въведете C: " );
		double c = scanner.nextDouble();
		
		// a < c < b
		if (a < c && c <b) {
			System.out.print("Числото " + c + " е между " + a + " и " + b );
		}
		else {
			System.out.print("Числото " + c + " не е между " + a + " и " + b );
		}
		
		scanner.close();
		
	}

}
