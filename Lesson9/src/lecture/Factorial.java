package lecture;

public class Factorial {

	public static void main(String[] args) {
		int x = 5;

		int fact = factorial(x);
		System.out.println(fact);

	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
