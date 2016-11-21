package lection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("n = ");
		int n = sc.nextInt();

		int[] arr = generateRandomArray(n);
		System.out.println(Arrays.toString(arr));

		String text1 = "Java is my favourite course";
		String text2 = "em";

		System.out.println(text1.contains(text2));
		sc.close();
	}

	public static int[] generateRandomArray(int n) {

		Random random = new Random();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}

		return arr;

	}

	public static boolean contains(String str1, String str2) {
		return str1.contains(str2);
	}

}
