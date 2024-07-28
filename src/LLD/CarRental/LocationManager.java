package LLD.CarRental;

import java.util.List;

public class LocationManager {
	List<Location> locationList;

	public LocationManager(List<Location> locationList) {
		this.locationList = locationList;
	}

	public List<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}
}
