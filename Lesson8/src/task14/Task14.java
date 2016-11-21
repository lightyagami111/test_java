package task14;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Въведете число за изчисляване на факториел: ");
			n = sc.nextInt();
		} while (n < 0);

		int product = factorial(n);
		System.out.println(n + "! = " + product);
		sc.close();
	}

	public static int factorial(int n) {

		int product = 1;

		for (int i = 2; i <= n; i++) {
			product *= i;
		}

		return product;
	}

}
