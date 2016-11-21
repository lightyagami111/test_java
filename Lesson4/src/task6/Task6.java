package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("number: ");
		int num = sc.nextInt();

		int result = 0;
		int power = 1;

		int ones = 0;
		int zeroes = 0;

		while (num > 0) {
			int reminder = num % 2;

			if (reminder == 1) {
				ones++;
			} else {
				zeroes++;
			}

			num /= 2;

			result = result + reminder * power;
			power *= 10;
		}

		System.out.println(result);
		System.out.println("1 bits are: " + ones);

		System.out.println(zeroes > ones ? "zeroes" : (zeroes == ones ? "ravni" : "ones"));

		sc.close();

	}

}
