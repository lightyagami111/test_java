package task3;

import java.util.Scanner;

public class Taks3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Въведете а: ");
		int a = scanner.nextInt();
		
		System.out.print("Въведете b: ");
		int b = scanner.nextInt();
		
		a = a - b;
		b = a + b;		
		a = b - a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		scanner.close();
		
	}
	
}
