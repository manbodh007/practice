package LLD.NullObjectDesignPattern;


public class Car implements Vehicle{

	@Override
	public int getSeatingCapacity() {
		return 4;
	}

	@Override
	public int getTankCapacity() {
		return 30;
	}
}
