package structure.decorator.example2.impl.concreteBeverage;

import structure.decorator.example2.interfaces.Beverage;

public abstract class AbstractBeverage implements Beverage {

    private int cost;
    public AbstractBeverage(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int cost() {
        return this.cost;
    }
}
