package designPatterns.StrategyPattern;

public class NormalVehicleStrategy implements Strategy{
	@Override
	public void drive() {
		System.out.println("this is a normal vehicle strategy");
	}
	@Override
	public void printSpecifications() {
		String vehicleName = "Normal";
		int maxSpeed = 80;
		int gears = 4;
		String mileage = "60km";
		System.out.println(vehicleName + " , " + maxSpeed + " , " + gears + " , " + mileage);
	}
}
