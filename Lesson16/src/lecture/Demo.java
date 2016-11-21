package lecture;

public class Demo {

	public static void main(String[] args) {
		Person pesho = new Person("8705126325");
		Person pesho2 = new Person("550915252");

		Item[] items = new Item[5];
		for (int i = 0; i < items.length; i++) {
			items[i] = new Item("Обект-" + (int) ((Math.random() * 100) + 1));
		}

		// print items
		for (int i = 0; i < items.length; i++) {
			System.out.println("Item name: " + items[i].getItemName() + ", Item ID:  " + items[i].getItemId());
		}

	}

}
