package task2;

public class StudentGroup {

	String groupSubject; // специалност на студентите в групата
	Student[] students; // студенти в групата
	int freeSpaces; // свободни места в групата

	public StudentGroup() {
		students = new Student[5];
		freeSpaces = students.length;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (s.getSubject().equals(groupSubject) && (freeSpaces > 0 && freeSpaces <= 5)) {
			students[students.length - freeSpaces] = s;
			freeSpaces--;
		}

		if (freeSpaces <= 0) {
			System.out.println("Няма повече свободни места.");
			return;
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freeSpaces = students.length;
	}

	// връща името на студента с най-висок успех в групата
	void theBestStudent() {

		if (students[0] != null) {
			Student bestStudent = students[0];

			for (int i = 1; i < students.length - freeSpaces; i++) {
				if (students[i].getGrade() > bestStudent.getGrade()) {
					bestStudent = students[i];
				}
			}
			System.out.println("С най-висок в групата е " + bestStudent.getName());
		} else {
			System.out.println("В курса няма студенти.");
		}

	}

	void printStudentsInGroup() {
		if (freeSpaces == 5) {
			System.out.println("В курса няма студенти.");
		} else {
			for (int i = 0; i < students.length - freeSpaces; i++) {
				System.out.println("Студент " + (i + 1) + " в специалност " + groupSubject + ": ");
				System.out.println("Име: " + students[i].getName());
				System.out.println("Успех: " + students[i].getGrade());
				System.out.println("Kурс: " + students[i].getYearInCollеge());
				System.out.println("Години: " + students[i].getAge());
				System.out.println("Пари: " + students[i].getMoney());
				System.out.println(students[i].isDegree() ? "завършил/а" : "не е завършил/а");
				System.out.println("-----------------------");
			}
		}
	}

}
