package lecture;

public class SumFactorial {

	public static void main(String[] args) {

		int n = 5;
		int result = sumFactorial(n);
		System.out.println(result);
	}

	public static int sumFactorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n + sumFactorial(n - 1);

	}

}
