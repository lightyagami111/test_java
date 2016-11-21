package task15;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете число: ");
		int num = scanner.nextInt();

		int sum = 1;
		int i = 0;
		
		if (num>=1) {
			i = 2;
			do {
				sum +=i;
				i++;
			} while (i <= num);
		}else {
			do {
				sum+=i;
				i++;
			} while (i < 1);
		}
			
		System.out.print("Резултата е: " + sum);
		scanner.close();
	}

}
