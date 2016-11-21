package addTask2;

import java.util.Scanner;

public class AddTask2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a char: ");
		char ch = sc.next().charAt(0);

		char[] arr = { 'm', 'n', '+', 'f' };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				index = i;
				break;
			}
		}

		System.out.println((index != 0) ? "символът е намерен на индекс: " + index : "не е намерен такъв символ");

		sc.close();
	}

}
