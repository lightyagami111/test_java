package exceptionchaining;

public class SuperClass {

	public static void main(String[] args) {
		// �� ������������ �� chained exception � ��������� �� ��������������
		// �� Throwable
		// Throwable(Throwable cause) {
		//
		// }
		//
		//
		// Throwable(String msg, Throwable cause) {
		//
		// }

		// � �������� getCause() / initCause(Throwable cause)

		try {
			// creating an exception

			NumberFormatException ex = new NumberFormatException("Exception");

			// setting a cause of the exception

			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			throw ex;
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}

	}

}
