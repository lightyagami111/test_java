package task1;

public class Computer {

	int year; // числова стойност, година на производство
	double price; // цена на компютъра
	boolean isNotebook; // преносим или не преносим компютър
	int hardDiskMemory; // размер на харддиск
	int freeMemory; // размер на свободна памет
	String operationSystem; // операционна система

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.isEmpty()) {
			operationSystem = newOperationSystem;
		} else {
			System.out.println("Empty new operation system.");
		}
	}

	void useMemory(int memory) {
		if (memory <= freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}

}
