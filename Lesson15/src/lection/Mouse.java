package lection;

public class Mouse {

	String color;
	String name;
	int age;
	boolean hasRabbies;

	Mouse() {
		System.out.println("A default mouse has been created");
	}

	Mouse(String nameParam) {
		name = nameParam;
		color = "White";
	}

	Mouse(String newName, String newColor) {
		if (!newName.isEmpty()) {
			name = newName;
		} else {
			name = "John Doe";
		}
		color = newColor;
		System.out.println("A mouse has been created");
		for (int i = 0; i < 10; i++) {
			makeNoise();
			eat();
		}
	}

	void eat() {
		System.out.println("Nom Nom!");
	}

	void makeNoise() {
		System.out.println("Cvur!");
	}
}
