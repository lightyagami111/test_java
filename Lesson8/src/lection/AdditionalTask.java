package lection;

public class AdditionalTask {

	public static void main(String[] args) {

		int ascii[] = { 65, 66, 67, 68 };
		String str = new String(ascii, 1, 3);
		// System.out.println(str);
		String x = "techbeamers";
		String y = new String(new char[] { 't', 'e', 'c', 'h', 'b', 'e', 'a', 'm', 'e', 'r', 's' });
		System.out.println(x == y);
		System.out.println(x.equals(y));

	}

}
