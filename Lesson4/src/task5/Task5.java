package task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("number: ");
		int num = sc.nextInt();
		int temp;

		int result = 0;
		int power = 1;

		do {
			int ostatuk = num % 2;
			num /= 2;
			System.out.println(ostatuk);
			result = result + ostatuk * power;
			power *= 10;

		} while (num > 0);

		System.out.println(result);
	}

}
