package task2;

public class StudentGroup {

	String groupSubject; // ����������� �� ���������� � �������
	Student[] students; // �������� � �������
	int freeSpaces; // �������� ����� � �������

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
			System.out.println("���� ������ �������� �����.");
			return;
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freeSpaces = students.length;
	}

	// ����� ����� �� �������� � ���-����� ����� � �������
	void theBestStudent() {

		if (students[0] != null) {
			Student bestStudent = students[0];

			for (int i = 1; i < students.length - freeSpaces; i++) {
				if (students[i].getGrade() > bestStudent.getGrade()) {
					bestStudent = students[i];
				}
			}
			System.out.println("� ���-����� � ������� � " + bestStudent.getName());
		} else {
			System.out.println("� ����� ���� ��������.");
		}

	}

	void printStudentsInGroup() {
		if (freeSpaces == 5) {
			System.out.println("� ����� ���� ��������.");
		} else {
			for (int i = 0; i < students.length - freeSpaces; i++) {
				System.out.println("������� " + (i + 1) + " � ����������� " + groupSubject + ": ");
				System.out.println("���: " + students[i].getName());
				System.out.println("�����: " + students[i].getGrade());
				System.out.println("K���: " + students[i].getYearInColl�ge());
				System.out.println("������: " + students[i].getAge());
				System.out.println("����: " + students[i].getMoney());
				System.out.println(students[i].isDegree() ? "��������/�" : "�� � ��������/�");
				System.out.println("-----------------------");
			}
		}
	}

}
