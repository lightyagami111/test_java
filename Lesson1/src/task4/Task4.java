package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a= ");
		int a = scanner.nextInt();
		
		System.out.print("b= ");
		int b = scanner.nextInt();
		
		// 255, 58
		if (a > b) {
			System.out.println(b + ", " + a);
		}else {
			System.out.println(a + ", " + b);
		}
	
		
		scanner.close();
	}

}
