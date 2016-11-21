package abstraction;

public class Demo {

	public static void main(String[] args) {

		Car car1 = new Car();
		Bike bike1 = new Bike();
		Plane plane1 = new Plane();
		car1.beep();
		plane1.beep();
		
		ServiceDepot sp = new ServiceDepot();
		sp.addVehicle(car1);
		sp.addVehicle(bike1);
		sp.addVehicle(plane1);
		sp.addVehicle(new Bus());
	}
}
