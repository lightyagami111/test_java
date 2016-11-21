package lecture;

public class VariableScope {

	public static void main(String[] args) {

		int x = 4;
		int y = 7;

		// System.out.println("Before method: ");
		// System.out.println(x);
		// System.out.println(y);
		//
		// swap(x, y);
		// System.out.println("After method: ");
		// System.out.println(x);
		// System.out.println(y);

		// System.out.println("-----------------------");
		//
		// int[] masiv = { 1, 2, 3 };
		// System.out.println("Before swap: ");
		// System.out.println(Arrays.toString(masiv));
		//
		// swap(masiv);
		// System.out.println("After swap: ");
		// System.out.println(Arrays.toString(masiv));

		String s1 = "kniga";
		String s2 = "laptop";
		System.out.println("Before swap: " + s1 + " : " + s2);

		swap(s1, s2);
		System.out.println("After swap: " + s1 + " : " + s2);
	}

	public static void swap(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s1 = temp;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(int[] arr) {
		int temp = arr[0];

		arr[0] = arr[1];
		arr[1] = temp;
	}

}
