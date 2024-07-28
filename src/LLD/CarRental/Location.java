package LLD.CarRental;

import java.util.List;

public class Location {
	private String city;
	private String pinCode;
	private String locationCode;
	private String address;

	public Location(String city, String pinCode, String locationCode, String address) {
		this.city = city;
		this.pinCode = pinCode;
		this.locationCode = locationCode;
		this.address = address;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
