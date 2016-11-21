package oopprincipes;

public class SciensBook extends BookDetails {

	@Override
	protected void setBook(String title) {
		// TODO Auto-generated method stub
		super.setBook(title);
	}

	// overloading
	void setBook(String title, String publisher, float price) {

	}

	protected static void name() {
		System.out.println("name from sub class");
	}

}
