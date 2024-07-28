package designPatterns.StrategyPattern;

public class SportVehicle extends Vehicle{
	public SportVehicle() {
		super(new SportVehicleStrategy());
	}
}
