package LLD.ParkingLot;

public class Application {
	public static void main(String[] args) {
		initiateProgram();
		SpotManagerFactory spotManagerFactory = new SpotManagerFactory();
		Vehicle vehicle = new Vehicle(VehicleType.CYCLE, "CYC123");
		Vehicle vehicle1 = new Vehicle(VehicleType.CAR, "CAR1234");
		Vehicle vehicle3 = new Vehicle(VehicleType.CAR, "CAR1236");
		Vehicle vehicle2 = new Vehicle(VehicleType.BIKE, "BI12345");
		bookSpot(vehicle, spotManagerFactory.getSpotManager(vehicle.getVehicleType()));
		bookSpot(vehicle1, spotManagerFactory.getSpotManager(vehicle1.getVehicleType()));
		bookSpot(vehicle2, spotManagerFactory.getSpotManager(vehicle2.getVehicleType()));
		bookSpot(vehicle3, spotManagerFactory.getSpotManager(vehicle3.getVehicleType()));
	}

	private static void bookSpot(Vehicle vehicle, SpotManager spotManager) {
		Ticket ticket = spotManager.bookSpot(vehicle);
		ticket.printTicket();
	}

	private static void initiateProgram() {
		SpotManager bikeSpotManager = new BikeSpotManager();
		SpotManager carSpotManager = new CarSpotManager();
		SpotManager cycleSpotManager = new CycleSpotManager();
	}
}
