package LLD.CarRental;

public interface Vehicle {
	int getHourlyCharge();
	int getDailyCharge();
	int getSeatingCapacity();
	String getVehicleNumber();
	boolean reserveVehicle();
	boolean getReservationStatus();
}
