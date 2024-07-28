package LLD.ParkingLot;

import java.util.Collections;
import java.util.List;

public class CycleSpotManager extends SpotManager {
	public CycleSpotManager() {
		super(Collections.singletonList(new CycleSpot()));
	}
}
