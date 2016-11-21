package exceptionchaining;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws PojarException {
		House kushta = new House();
		kushta.p = new Person();
		kushta.throwParty();

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int x = sc.nextInt();

		} catch (InputMismatchException x) {
			// TODO: handle exception
		} finally {
			sc.close();
		}
	}

}
