package LLD.ParkingLot;

import java.math.BigDecimal;

public class Spot {

	private Vehicle vehicle;
	private boolean empty;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	private int price;
	private VehicleType vehicleType;

	public Spot(Vehicle vehicle, boolean empty, int price, VehicleType vehicleType) {
		this.vehicle = vehicle;
		this.empty = empty;
		this.price = price;
		this.vehicleType = vehicleType;
	}
}
