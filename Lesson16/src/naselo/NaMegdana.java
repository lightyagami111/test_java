package naselo;

public class NaMegdana {

	public static void main(String[] args) {
		Peasant stavri = new Peasant("Stavri Gegata");

		Sheep[] stado = new Sheep[10];
		for (int i = 0; i < stado.length; i++) {
			stado[i] = new Sheep("");
		}

		Sheep ganka = new Sheep("Ganka");

		// Sheep.ovchar = stavri;
		// System.out.println(Sheep.ovchar.getName());

		System.out.println(Sheep.kolkoPuloveraMogaDaNapravq(5));
	}

}
