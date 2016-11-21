package task1;

public class Demo {

	public static void main(String[] args) {
		Person[] persons = new Person[10];

		Person person1 = new Person("Georgi", 25, false);
		Person person2 = new Person("Krasimira", 34, true);

		Student student1 = new Student("Ivan", 16, false);
		Student student2 = new Student("Hristo", 26, false);

		Employee employee1 = new Employee("Svetlio", 30, false, 420);
		Employee employee2 = new Employee("Zdravka", 38, true, 340);

		persons[0] = person1;
		persons[1] = person2;
		persons[2] = student1;
		persons[3] = student2;
		persons[4] = employee1;
		persons[5] = employee2;

		// for (int i = 0; i < persons.length; i++) {
		// if (persons[i] == null) {
		// continue;
		// }
		// // instance of Student
		// if (persons[i] instanceof Student) {
		// ((Student) persons[i]).showStudentInfo();
		// }
		//
		// // instance of Employee
		// if (persons[i] instanceof Employee) {
		// ((Employee) persons[i]).showEmployeeInfo();
		// }
		//
		// }

		for (int j = 0; j < persons.length; j++) {
			if (persons[j] instanceof Employee) {
				System.out.println(((Employee) persons[j]).calculateOvertime(2) + " overtime");
			}
		}

	}

}
