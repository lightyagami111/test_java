package lecture;

public class Item {

	private static int uniqueId = 1;
	private final int itemId;
	private String itemName;

	public Item(String itemName) {
		this.itemName = itemName;
		this.itemId = uniqueId;
		uniqueId++;
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
