package designPatterns.DecoratorPattern.Decorator;

import designPatterns.DecoratorPattern.BasePizza.BasePizza;

public class Onion implements BasePizza {
	private final BasePizza basePizza;

	public  Onion(BasePizza pizza){
		this.basePizza = pizza;
	}
	@Override
	public int cost() {
		return this.basePizza.cost() + 30;
	}
}
