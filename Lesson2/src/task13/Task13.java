package task13;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		
		
		int tempSum = 0;
		for (int i = 100; i <= 999; i++) {
			
			int firstNum = i / 100;
			int secondNum = (i / 10) % 10;
			int thirdNum = i % 10;
			
			tempSum += firstNum + secondNum + thirdNum;
			
			if (tempSum == sum) {
				System.out.print(i + " ");
			}
			
			tempSum = 0;
		}
		
		scanner.close();
	}

}
