package LLD.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class SpotManagerFactory {
	Map<String, SpotManager> spotManagerList = new HashMap<>();

	public SpotManagerFactory() {
		spotManagerList.put("CAR", new CarSpotManager());
		spotManagerList.put("CYCLE", new CycleSpotManager());
		spotManagerList.put("BIKE", new BikeSpotManager());
	}

	public SpotManager getSpotManager(VehicleType vehicleType) {
		return spotManagerList.get(vehicleType.toString());
	}
}
