package structure.decorator.example2.impl.decorators;

import structure.decorator.example2.interfaces.Beverage;

public class Milk extends AbstractDecorator {

    public Milk(int cost, Beverage beverage) {
        super(cost, beverage);
    }

    @Override
    public int cost() {
        return this.getBeverage().getCost() + getCost();
    }
}
