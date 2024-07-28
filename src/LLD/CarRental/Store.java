package LLD.CarRental;

import java.util.ArrayList;
import java.util.List;

public class Store {
	private String storeId;
	private Location location;
	private List<Vehicle> vehicles;

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Store(String storeId, Location location) {
		this.vehicles = new ArrayList<>();
		this.storeId = storeId;
		this.location = location;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void addVehicles(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
}
