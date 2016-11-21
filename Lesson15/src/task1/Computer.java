package task1;

public class Computer {

	int year; // ������� ��������, ������ �� ������������
	private double price; // ���� �� ���������
	boolean isNotebook; // �������� ��� �� �������� ��������
	double hardDiskMemory; // ������ �� ��������
	double freeMemory; // ������ �� �������� �����
	String operationSystem; // ����������� �������

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.operationSystem = operationSystem;
	}

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

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		}

		return 0;
	}

}
