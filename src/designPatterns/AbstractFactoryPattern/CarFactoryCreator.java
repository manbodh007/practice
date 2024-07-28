package designPatterns.AbstractFactoryPattern;

public class CarFactoryCreator {
	private final CarFactory carFactory;

	public CarFactoryCreator(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	public CarFactory getCarFactory() {
		return carFactory;
	}
}
