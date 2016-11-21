package exceptionchaining;

public class House {

	Person p;

	public void throwParty() throws PojarException {
		try {
			p.smoke();
		} catch (FasException e) {
			System.out.println("Fuck...");
			throw new PojarException(e);
		}
	}

}
