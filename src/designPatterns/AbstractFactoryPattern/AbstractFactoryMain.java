package designPatterns.AbstractFactoryPattern;

public class AbstractFactoryMain {
	public static void main(String [] args){
		CarFactoryCreator carFactoryCreator = new CarFactoryCreator(new IndianCarFactory());
		CarFactory carFactory = carFactoryCreator.getCarFactory();
		Car car = carFactory.createCar("TATA");
		car.printSpecification();
	}
}
