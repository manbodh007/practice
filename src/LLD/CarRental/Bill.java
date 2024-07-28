package LLD.CarRental;

public class Bill {
	private User user;
	private Vehicle vehicle;
	private Store store;
	private String paymentStatus;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
