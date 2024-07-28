package LLD.ParkingLot;

import java.time.LocalDateTime;
import java.util.List;

public class SpotManager {
	private List<Spot> spots;

	public List<Spot> getSpots() {
		return spots;
	}

	public SpotManager(List<Spot> spots) {
		this.spots = spots;
	}

	public void setSpots(List<Spot> spots) {
		this.spots = spots;
	}

	public Spot findSpot() {
		for (Spot spot : spots) {
			if (spot.isEmpty()) {
				return spot;
			}
		}
		return null;
	}

	private Spot findBookedSpot(Vehicle vehicle) {
		for (Spot spot : spots) {
			if (spot.getVehicle().getVehicleNumber().equals(vehicle.getVehicleNumber()))
				return spot;
		}
		return null;
	}

	public Ticket bookSpot(Vehicle vehicle) {
		Spot spot = findSpot();
		if (spot != null) {
			spot.setVehicle(vehicle);
			spot.setEmpty(false);
			return new Ticket(spot, vehicle, LocalDateTime.now());
		} else {
			throw new RuntimeException("Spot not found");
		}
	}

	public int releaseSpotAndCalculatePrice(Ticket ticket) {
		Spot spot = findBookedSpot(ticket.getVehicle());
		assert spot != null;
		spot.setVehicle(null);
		spot.setEmpty(true);
		return ticket.getSpot().getPrice();
	}
}
