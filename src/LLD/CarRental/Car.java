package LLD.CarRental;

public class Car extends VehicleInfo implements Vehicle {

	public Car(String vehicleNumber) {
		super(vehicleNumber, false);
	}

	@Override
	public int getHourlyCharge() {
		return 100;
	}

	@Override
	public int getDailyCharge() {
		return 1000;
	}

	@Override
	public int getSeatingCapacity() {
		return 4;
	}
}
