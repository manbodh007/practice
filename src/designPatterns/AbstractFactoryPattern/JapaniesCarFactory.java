package designPatterns.AbstractFactoryPattern;

public class JapaniesCarFactory implements CarFactory{

	@Override
	public Car createCar(String brandName) {
		if(brandName.equals("HUYNDAI")){
			return new CretaCar();
		}else{
			throw new IllegalArgumentException("Invalid brand name");
		}
	}
}
