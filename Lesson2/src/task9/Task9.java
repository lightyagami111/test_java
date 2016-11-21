package task9;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("a: ");
		int a = scanner.nextInt();
		
		System.out.print("b: ");
		int b = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = a; i<= b; i++) {
			if (i % 3 == 0) {				
				System.out.print("skip 3, ");
				continue;
			}
			
			sum += i*i;
			
			System.out.print(i*i + ", ");
			
			if (sum > 200) {
				break;
			}
		
		}
		
		scanner.close();
		
	}

}
