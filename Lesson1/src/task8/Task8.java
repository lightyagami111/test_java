package task8;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Въведете 4-цифрено естествено число в интервала [1000....9999]:");
		int number = scanner.nextInt();

		// 5789 ---> 5 i 9
		
		int digit4 = number % 10; // 9
		int digit3 = (number / 10) % 10; // 8
		int digit2 = (number / 100) % 10; // 7
		int digit1 = number / 1000; // 5

		int number1 = 10*digit1 + digit4;
		int number2 = 10*digit2 + digit3;
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		
	//	String number1 = digit1 + "" + digit4;
	//	String number2 = digit2 + "" + digit3;

//		if ((digit1 > digit2) || ((digit1 == digit2) && (digit4 > digit3))) {
//			System.out.println(number1 + " по-голямо от " + number2);
//		}		
//		else if((digit1< digit2) || ((digit1 == digit2) && (digit4 < digit3))) {
//			System.out.println(number1 + " по-малко от " + number2);
//		} else {
//			System.out.println(number1 + " е равно на " + number2);
//		}

		scanner.close();

	}

}
