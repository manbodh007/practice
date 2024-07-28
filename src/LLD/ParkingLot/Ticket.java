package LLD.ParkingLot;

import java.time.LocalDateTime;

public class Ticket {
	private Spot spot;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Ticket(Spot spot, Vehicle vehicle, LocalDateTime bookingTime) {
		this.spot = spot;
		this.vehicle = vehicle;
		this.bookingTime = bookingTime;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public void printTicket() {
		System.out.println("Spot " + spot);
		System.out.println("Vehicle " + vehicle);
		System.out.println("Booking Time " + bookingTime);
	}

	private Vehicle vehicle;
	private LocalDateTime bookingTime;
}
