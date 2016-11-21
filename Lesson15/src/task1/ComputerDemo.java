package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.year = 2014;
		c1.setPrice(890.90);
		c1.hardDiskMemory = 850;
		c1.freeMemory = 520;
		c1.isNotebook = true;
		c1.operationSystem = "Windows 10";

		Computer c2 = new Computer();
		c2.year = 2016;
		c2.setPrice(600.85);
		c2.hardDiskMemory = 1024;
		c2.freeMemory = 800;
		c2.isNotebook = false;
		c2.operationSystem = "Windows 7";

		c2.useMemory(100);
		c1.changeOperationSystem("Windows XP");

		System.out.println("Print c1 fileds: ");
		System.out.println("year: " + c1.year);
		System.out.println("price: " + c1.getPrice());
		System.out.println("hardDiskMemory: " + c1.hardDiskMemory);
		System.out.println("freeMemory: " + c1.freeMemory);
		System.out.println(c1.isNotebook ? "The computer is a notebook" : "The computer is not a notebook");
		System.out.println("operationSystem: " + c1.operationSystem);

		System.out.println("-----------------------------------------");

		// print fileds for c2:
		System.out.println("Print c2 fileds: ");
		System.out.println("year: " + c2.year);
		System.out.println("price: " + c2.getPrice());
		System.out.println("hardDiskMemory: " + c2.hardDiskMemory);
		System.out.println("freeMemory: " + c2.freeMemory);
		System.out.println(c2.isNotebook ? "The computer is a notebook" : "The computer is not a notebook");
		System.out.println("operationSystem: " + c2.operationSystem);

		Computer comp1 = new Computer(2006, 560, 920.50, 745.26);
		Computer comp2 = new Computer(2009, 560, true, 850, 840, "Windows 2000");

		Computer comp3 = new Computer();
		comp3.setPrice(400);

		int result = comp1.comparePrice(comp3);
		if (result == -1) {
			System.out.println("Цената на първия компютър е по-висока от цената на втория.");
		} else if (result == 1) {
			System.out.println("Цената на първия компютър е по-ниска от цената на втория.");
		} else {
			System.out.println("Цената на първия компютър е равна на цената на втория.");
		}

	}

}
