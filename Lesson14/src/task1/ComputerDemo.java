package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.year = 2014;
		c1.price = 890.90;
		c1.hardDiskMemory = 850;
		c1.freeMemory = 520;
		c1.isNotebook = true;
		c1.operationSystem = "Windows 10";

		Computer c2 = new Computer();
		c2.year = 2016;
		c2.price = 720;
		c2.hardDiskMemory = 1024;
		c2.freeMemory = 800;
		c2.isNotebook = false;
		c2.operationSystem = "Windows 7";

		c2.useMemory(100);
		c1.changeOperationSystem("Windows XP");

		// print fileds for c1:
		System.out.println("Print c1 fileds: ");
		System.out.println("year: " + c1.year);
		System.out.println("price: " + c1.price);
		System.out.println("hardDiskMemory: " + c1.hardDiskMemory);
		System.out.println("freeMemory: " + c1.freeMemory);
		System.out.println(c1.isNotebook ? "The computer is a notebook" : "The computer is not a notebook");
		System.out.println("operationSystem: " + c1.operationSystem);

		System.out.println("-----------------------------------------");

		// print fileds for c2:
		System.out.println("Print c2 fileds: ");
		System.out.println("year: " + c2.year);
		System.out.println("price: " + c2.price);
		System.out.println("hardDiskMemory: " + c2.hardDiskMemory);
		System.out.println("freeMemory: " + c2.freeMemory);
		System.out.println(c2.isNotebook ? "The computer is a notebook" : "The computer is not a notebook");
		System.out.println("operationSystem: " + c2.operationSystem);
	}

}
