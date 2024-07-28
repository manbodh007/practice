package LLD.CarRental;

public class Bike extends VehicleInfo implements Vehicle{

	public Bike(String vehicleNumber) {
		super(vehicleNumber, false);
	}

	@Override
	public int getHourlyCharge() {
		return 10;
	}

	@Override
	public int getDailyCharge() {
		return 500;
	}

	@Override
	public int getSeatingCapacity() {
		return 2;
	}
}
