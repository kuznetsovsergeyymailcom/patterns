package action.strategy;

import action.strategy.impl.Flyable;
import action.strategy.impl.NonFlyable;
import action.strategy.model.Bird;
import action.strategy.model.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog(12);
        Animal animalCantFly = new Bird(2);

        animal.setFlyType(new Flyable());
        animalCantFly.setFlyType(new NonFlyable());

        animal.tryToFly();
        animalCantFly.tryToFly();

    }

}
