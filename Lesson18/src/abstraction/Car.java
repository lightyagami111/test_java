package abstraction;

import storage.StorageUnit;

public class Car implements Vehicle, StorageUnit {

	private int currentSpeed;

	@Override
	public void beep() {
		/**
		 * Choice witch beap method to override - from witch super class -
		 * Vehicle or StorageUnit or nothing?
		 */
		Vehicle.super.beep();
		StorageUnit.super.beep();
	}

	@Override
	public void turn(String direction) {
		switch (direction) {
		case "Left":
			this.turnLeft();
			break;
		case "Up":
			System.out.println("Lud li si?");
			break;
		}
	}

	@Override
	public void stop() {
		System.out.println("Use brakes");
	}

	@Override
	public void accelerate() {
		System.out.println("Speed is up");
		currentSpeed++;
	}

	private void turnLeft() {
		System.out.println("Turning the wheel to the left");
	}

	@Override
	public void fill(String stuff) {
		// TODO Auto-generated method stub

	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub

	}

}
