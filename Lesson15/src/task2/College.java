package task2;

public class College {

	public static void main(String[] args) {
		Student pesho = new Student("Pesho", "IT", 21);
		pesho.setGrade(5.35);

		Student lili = new Student("Lili", "IT", 20);
		lili.setGrade(5.29);
		lili.receiveScholarship(4, 32.80);

		Student zdravko = new Student("Zdravko", "IT", 30);
		zdravko.setGrade(5.89);
		zdravko.upYear();
		zdravko.setDegree(true);

		// Student petq = new Student("Petq", "IT", 28);
		// petq.grade = 6.00;

		Student vesko = new Student("Vesko", "IT", 18);

		Student vqra = new Student("Vqra", "IT", 19);

		StudentGroup sGroup = new StudentGroup("IT");

		// System.out.println("Array before adding student.");
		// System.out.println(Arrays.toString(sGroup.students));

		// System.out.println("Array after adding student.");
		sGroup.addStudent(pesho);
		sGroup.addStudent(lili);
		sGroup.addStudent(zdravko);
		// sGroup.addStudent(petq);
		// System.out.println(Arrays.toString(sGroup.students));

		// sGroup.theBestStudent();
		sGroup.printStudentsInGroup();

	}

}
