package LLD.CarRental;

public class VehicleInfo {
	private String vehicleNumber;
	private Boolean isReserved;

	public VehicleInfo(String vehicleNumber, Boolean isReserved) {
		this.vehicleNumber = vehicleNumber;
		this.isReserved = isReserved;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public Boolean getReserved() {
		return isReserved;
	}

	public synchronized boolean reserveVehicle() {
		if (!isReserved) {
			isReserved = true;
			return true;
		} else
			return false;
	}

	public synchronized boolean getReservationStatus(){
		return isReserved;
	}
}
