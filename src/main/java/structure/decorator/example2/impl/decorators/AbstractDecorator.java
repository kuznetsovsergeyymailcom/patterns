package structure.decorator.example2.impl.decorators;

import structure.decorator.example2.interfaces.Beverage;
import structure.decorator.example2.interfaces.Decorator;

public abstract class AbstractDecorator implements Decorator {

    private int cost;
    private Beverage beverage;

    public AbstractDecorator(int cost, Beverage beverage) {
        this.cost = cost;
        this.beverage = beverage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        System.out.println(this.cost);
        return cost;
    }
}
