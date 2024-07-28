package LLD.CarRental;

import java.util.List;
import java.util.stream.Collectors;

public class StoreManager {
	private List<Store> stores;

	public List<Store> getAllStored() {
		return stores;
	}

	public void addStores(List<Store> stores) {
		if (this.stores == null)
			this.stores = stores;
		else
			this.stores.addAll(stores);
	}

	public List<Store> getStoreOfLocation(String city){
		return stores.stream().filter(store -> store.getLocation().getCity().equalsIgnoreCase(city)).collect(
				Collectors.toList());
	}
}
