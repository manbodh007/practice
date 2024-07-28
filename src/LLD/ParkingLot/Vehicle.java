package LLD.ParkingLot;

public class Vehicle {
	private VehicleType vehicleType;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	private String vehicleNumber;

	public Vehicle(VehicleType vehicleType, String vehicleNumber) {
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}
}
