package task1;

public class Task1 {

	public static void main(String[] args) {
		int first = 5;
		int second = 8;

		interval(first, second);

	}

	static void interval(int n1, int n2) {

		if (n1 == n2) {
			System.out.println(n2);
		} else {
			System.out.print(n1 + " ");
			interval(++n1, n2);
		}

	}

}
