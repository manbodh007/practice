package LLD.CarRental;

import java.time.LocalDateTime;

public class Reservation {
	private String reservationId;
	private User reservedBy;
	private Vehicle reservedVehicle;
	private LocalDateTime reservationFrom;
	private LocalDateTime reservationTo;

	public User getReservedBy() {
		return reservedBy;
	}

	public void setReservedBy(User reservedBy) {
		this.reservedBy = reservedBy;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Vehicle getReservedVehicle() {
		return reservedVehicle;
	}

	public void setReservedVehicle(Vehicle reservedVehicle) {
		this.reservedVehicle = reservedVehicle;
	}

	public LocalDateTime getReservationTo() {
		return reservationTo;
	}

	public void setReservationTo(LocalDateTime reservationTo) {
		this.reservationTo = reservationTo;
	}

	public LocalDateTime getReservationFrom() {
		return reservationFrom;
	}

	public void setReservationFrom(LocalDateTime reservationFrom) {
		this.reservationFrom = reservationFrom;
	}
}
