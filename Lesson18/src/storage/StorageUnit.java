package storage;

public interface StorageUnit {
	
	default void beep(){
		System.out.println("Beep Beep");
	}
	void fill(String stuff);
	void empty();
	void open();
	void lock();
}
