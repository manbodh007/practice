package designPatterns.StrategyPattern;

public class SportVehicleStrategy implements Strategy{
	@Override
	public void drive() {
		System.out.println("this is a sport vehicle strategy");
	}

	@Override
	public void printSpecifications() {
		String vehicleName = "Sport";
		int maxSpeed = 200;
		int gears = 6;
		String mileage = "30km";
		System.out.println(vehicleName + " , " + maxSpeed + " , " + gears + " , " + mileage);
	}
}
