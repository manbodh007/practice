package designPatterns.StrategyPattern;

public class Vehicle {
	private final Strategy strategy;
	public Vehicle(Strategy strategy){
		this.strategy = strategy;
	}
	public void drive(){
		strategy.drive();
	}
	public void print(){
		strategy.printSpecifications();
	}
}
