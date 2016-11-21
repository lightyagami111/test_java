package lection;

public class Car {

	public String brand;
	public String model;
	public final int maxSpeed = 150; // <-- constant
	public int currentSpeed;
	public String color;
	int currentGear;
	public Person owner;
	public final int maxGear = 5; // <-- constant
	private double price; // <-- encapsulation
	public boolean isSportCar;

	public Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		currentSpeed = 0;
		currentGear = 1;
	}

	void accelerate() {
		if (currentSpeed < maxSpeed) {
			currentSpeed++;
		}
	}

	void changeGearUp() {
		if (currentGear < maxGear) {
			currentGear++;
		}
	}

	void changeGearDown() {
		if (currentGear > 1) {
			currentGear--;
		}
	}

	void changeGear(int nextGear) {
		if (nextGear >= 1 && nextGear <= maxGear) {
			currentGear = nextGear;
		}
	}

	void changeColor(final String newColor) {

		// more code
		color = newColor;
	}

	boolean isMoreExpensive(Car testCar) {
		return this.price > testCar.price;
	}

	public void changeOwner(Person newOwner) {
		this.owner = newOwner;
	}

	// !!! валидация на данните
	void setPrice(double newPrice) {
		if (newPrice > 0) {
			this.price = newPrice;
		}
	}

	double getPrice() {
		return price;
	}

}
