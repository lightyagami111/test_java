package task25;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n: ");
		int num = scanner.nextInt();
		
		int result = 1;
		int i = 2;
		
		do {
			result *=i;
			i++;
		} while (i<=num);
		
		System.out.println(result);
		scanner.close();
		
	}
	
}
