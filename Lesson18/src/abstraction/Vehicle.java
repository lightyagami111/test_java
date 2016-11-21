package abstraction;

public interface Vehicle {

	default void beep() {
		System.out.println("Beep Beep");
	}

	public static final String SPEED_MEASURE = "km/h";
	int x = 4;// public static final int x = 4;
	static int x1 = 4;
	static final int x2 = 4;
	public static final int x3 = 4;

	void turn(String direction);

	public void stop();

	public void accelerate();
}
