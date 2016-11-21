package storage;

public class Locker implements StorageUnit{

	private static final int MAX_CAPACITY = 1;
	private int capacity;//m3
	
	@Override
	public void fill(String stuff) {
		//validate volume of the stuff before putting it in
		System.out.println("fill " + stuff + " in locker");
	}

	@Override
	public void empty() {
		capacity = MAX_CAPACITY;
	}

	@Override
	public void open() {
		System.out.println("Click ... ");
	}

	@Override
	public void lock() {
		System.out.println("Click click");
	}

}
