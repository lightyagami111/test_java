package exceptionchaining;

public class SuperClass {

	public static void main(String[] args) {
		// за реализацията на chained exception е осигурена от конструкторите
		// на Throwable
		// Throwable(Throwable cause) {
		//
		// }
		//
		//
		// Throwable(String msg, Throwable cause) {
		//
		// }

		// и методите getCause() / initCause(Throwable cause)

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
