package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число: ");
		int num = scanner.nextInt();

		int sum = 1;
	
		if (num>=1) {
			for(int i = 2; i <= num; i++) {
				sum += i;
			}		
		}else {
			for(int i = num; i < 1; i++) {
				sum += i;
			}		
		}
				
		System.out.print("Резултата е: " + sum);

		scanner.close();

	}

}
