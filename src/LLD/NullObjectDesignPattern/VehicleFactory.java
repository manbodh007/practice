package LLD.NullObjectDesignPattern;

public class VehicleFactory {
	public static Vehicle getVehicle(String vehicleType) {
		if ("CAR".equalsIgnoreCase(vehicleType))
			return new Car();
		else if ("cycle".equalsIgnoreCase(vehicleType))
			return new Cycle();

		return new NullVehicle();
	}
}
