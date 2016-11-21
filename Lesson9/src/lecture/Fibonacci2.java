package lecture;

import java.util.Scanner;

public class Fibonacci2 {

	public static long[] numbers;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n = "); // n = 3
		int n = sc.nextInt();

		numbers = new long[n + 1];
		numbers[1] = 1;
		numbers[2] = 1;

		// [1] [1] [2] [3] [5] [8] []
		// 1 2 3 4 5 6 7

		long result = fibonaci(n);
		System.out.printf("F%d = %d", n, result);

		sc.close();
	}

	public static long fibonaci(int n) {

		if (numbers[n] == 0) {
			numbers[n] = fibonaci(n - 1) + fibonaci(n - 2);
		}

		return numbers[n];
	}

}
