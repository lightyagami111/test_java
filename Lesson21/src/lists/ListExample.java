package lists;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		String[] arr = new String[5];
		// System.out.println(arr.length);
		arr[0] = "Pesho";
		arr[1] = "Gosho";
		// System.out.println(Arrays.toString(arr));

		ArrayList<String> list = new ArrayList();
		list.add("Pesho");
		list.add("Gosho");
		list.add("Mariq");
		list.add("Eleonora");

		// System.out.println(list.size());

		if (list.indexOf("Mariq") != -1) {
			list.set(list.indexOf("Mariq"), "Tisho");
		}

		System.out.println(list);
		// String removed = list.remove(1);
		// System.out.println(removed);
		// // list.remove("Gosho");
		//
		// System.out.println(list.contains("Pesho"));
		System.out.println(list.get(2));

		// list.add(3, "Eleonora");
		// System.out.println(list.size());
		// System.out.println(list);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Teodor");
		list2.add("Katq");
		// System.out.println(list2);
		// list2.addAll(list);
		// System.out.println(list2);

		ArrayList<Integer> chisla = new ArrayList<>();
		chisla.add(new Integer(5));
		chisla.add(3);

		Integer x = 500;
		Integer y = 500;

		Character m = 'ù';
		Character n = 'ÿ';

		// System.out.println(m == n);

	}

}
