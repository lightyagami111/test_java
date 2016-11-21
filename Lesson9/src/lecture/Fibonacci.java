package lecture;

public class Fibonacci {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		int x = 45;
		int result = findNfibNumber(x);
		System.out.println("Duration: " + (System.currentTimeMillis() - start));
	}

	public static int findNfibNumber(int n) {

		if (n == 1) {
			return 1;
		}

		if (n == 2) {
			return 1;
		}

		return findNfibNumber(n - 1) + findNfibNumber(n - 2);
	}

}
