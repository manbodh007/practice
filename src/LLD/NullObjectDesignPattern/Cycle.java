package LLD.NullObjectDesignPattern;

public class Cycle implements Vehicle{
	@Override
	public int getSeatingCapacity() {
		return 2;
	}

	@Override
	public int getTankCapacity() {
		return 0;
	}
}
