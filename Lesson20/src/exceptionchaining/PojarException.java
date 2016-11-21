package exceptionchaining;

public class PojarException extends Exception {

	public PojarException() {
		super();
	}

	public PojarException(String message) {
		super(message);
	}

	public PojarException(Throwable cause) {
		super(cause);
	}

	public PojarException(String message, Throwable cause) {
		super(message, cause);
	}

}
