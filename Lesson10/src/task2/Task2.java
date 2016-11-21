package task2;

public class Task2 {

	public static void main(String[] args) {
		int n = 5;
		deviredRec(n, 0);
	}

	public static void deviredRec(int n, int counter) {

		if (counter >= 3) {
			System.out.print(" ");
		} else {
			if (n % 3 != 0) {
				deviredRec(++n, counter++);
			} else {
				System.out.print(n + " ");
				deviredRec(++n, ++counter);

			}
		}

	}

}
