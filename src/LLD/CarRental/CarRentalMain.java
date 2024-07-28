package LLD.CarRental;

import java.util.Arrays;

public class CarRentalMain {

	public static void main(String[] args) {
		createAndAddVehicles();
	}

	private static void createAndAddVehicles() {
		Location location1 = new Location("raigarh", "496554", "1", "new basti");
		Location location2 = new Location("sarangarh", "496551", "2", "ola basti");
		Store store1 = new Store("1", location1);
		Store store2 = new Store("2", location2);
		Vehicle car = new Car("car1");
		Vehicle bike = new Bike("bike1");
		store1.addVehicles(car);
		store2.addVehicles(bike);

		LocationManager locationManager = new LocationManager(Arrays.asList(location2, location1));
		StoreManager storeManager = new StoreManager();
		storeManager.addStores(Arrays.asList(store1, store2));
		Store store = storeManager.getStoreOfLocation("raigarh").get(0);
		System.out.println(store.getStoreId());
		System.out.println(store.getVehicles().get(0).getVehicleNumber());
		Vehicle vehicle = store.getVehicles().get(0);
		System.out.println(vehicle.reserveVehicle());

		System.out.println(vehicle.getReservationStatus());
	}
}
