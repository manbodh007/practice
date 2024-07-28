package LLD.ParkingLot;

import java.util.Collections;

public class BikeSpotManager extends SpotManager {
	public BikeSpotManager() {
		super(Collections.singletonList(new BikeSpot()));
	}
}
