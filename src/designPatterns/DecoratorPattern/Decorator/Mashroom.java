package designPatterns.DecoratorPattern.Decorator;

import designPatterns.DecoratorPattern.BasePizza.BasePizza;

public class Mashroom implements BasePizza {
	private final BasePizza basePizza;

	public  Mashroom(BasePizza pizza){
		this.basePizza = pizza;
	}
	@Override
	public int cost() {
		return this.basePizza.cost() + 30;
	}
}
