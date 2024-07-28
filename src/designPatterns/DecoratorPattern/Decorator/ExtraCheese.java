package designPatterns.DecoratorPattern.Decorator;

import designPatterns.DecoratorPattern.BasePizza.BasePizza;

public class ExtraCheese implements BasePizza {
    private final BasePizza basePizza;
	public ExtraCheese (BasePizza pizza){
		this.basePizza = pizza;
	}
	@Override
	public int cost() {
		return this.basePizza.cost() + 10;
	}
}
