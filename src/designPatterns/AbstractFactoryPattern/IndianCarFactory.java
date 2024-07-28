package designPatterns.AbstractFactoryPattern;

public class IndianCarFactory implements CarFactory{

	@Override
	public Car createCar(String brandName) {
		switch (brandName) {
		case "TATA":
		      return new NanoCar();
		case "MAHINDRA":
			  return new Thar();
		default:
			  throw new IllegalArgumentException("Invalid brand name");
		}
	}

}
