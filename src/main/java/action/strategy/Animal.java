package action.strategy;

import action.strategy.interfaces.Fly;

public abstract class Animal {
    private double weight;

    private Fly flyType;

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fly getFlyType() {
        return flyType;
    }

    public void setFlyType(Fly flyType) {
        this.flyType = flyType;
    }

    public void tryToFly() {
        if (flyType != null) {
            System.out.println(flyType.fly());
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", flyType=" + flyType +
                '}';
    }
}
