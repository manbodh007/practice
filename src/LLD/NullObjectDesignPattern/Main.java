package LLD.NullObjectDesignPattern;

public class Main {
	public static void main(String args[]) {
		Vehicle vehicle = VehicleFactory.getVehicle("car");
		System.out.println(vehicle.getSeatingCapacity());
		Vehicle bikeVehicle = VehicleFactory.getVehicle("bike");
		System.out.println(bikeVehicle.getSeatingCapacity());
	}
}
