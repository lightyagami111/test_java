package advancedTask;

import lection.Car;
import lection.Person;

public class CarShop {

	Car[] cars;

	int freeSpaces;

	public CarShop(int capacity) {
		if (capacity > 0) {
			cars = new Car[capacity];
			this.freeSpaces = capacity;
		}
	}

	boolean addCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = car;
				return true;
			}
		}
		return false;
	}

	Car getNextCar() {
		Car car = cars[cars.length - freeSpaces - 1];

		// for (int i = 0; i < freeSpaces; i++) {
		// car = (Car) cars[i];
		// }
		return car;
	}

	void sellNextCar(Person buyer) {
		Car car = getNextCar();
		car.changeOwner(buyer);
		removeCar(car);
		System.out.println("Собственик: " + car.owner.name);
	}

	boolean removeCar(Car car) {
		for (int i = 0; i < cars.length - freeSpaces; i++) {
			if (cars[i].model.equals(car.model)) {
				cars[i] = null;
				freeSpaces++;
				return true;
			}
		}
		return false;
	}

	void showAllCarsInShop() {
		if (freeSpaces > 0 && freeSpaces != 4) {
			for (int i = 0; i < cars.length - freeSpaces; i++) {
				if (cars[i] != null) {
					System.out.println(cars[i].model);
				}
			}
		} else {
			System.out.println("Няма налични коли.");
		}
	}

}
