package LLD.ParkingLot;

public class SpotFactory {
	public Spot getSpot(VehicleType vehicleType) {
		switch (vehicleType) {
		case CAR:
			return new CarSpot();
		case CYCLE:
			return new CycleSpot();

		default:
			return new BikeSpot();
		}
	}
}
