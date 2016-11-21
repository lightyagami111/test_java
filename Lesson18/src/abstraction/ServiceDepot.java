package abstraction;

public class ServiceDepot {

	Vehicle[] vehiclesForRepair;
	
	public ServiceDepot() {
		vehiclesForRepair = new Vehicle[15];
	}
	
	public void addVehicle(Vehicle v){
		for (int i = 0; i < vehiclesForRepair.length; i++) {
			if(vehiclesForRepair[i] == null){
				vehiclesForRepair[i] = v;
				break;
			}
		}
	}
	
}
