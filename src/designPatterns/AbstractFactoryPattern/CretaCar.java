package designPatterns.AbstractFactoryPattern;

public class CretaCar implements Car{
	@Override
	public void printSpecification() {
		System.out.println("this is japanies car crete");
	}
}
