package LLD.ParkingLot;

import java.util.Collections;
import java.util.List;

public class CarSpotManager extends SpotManager {
	public CarSpotManager() {
		super(Collections.singletonList(new CarSpot()));
	}
}
