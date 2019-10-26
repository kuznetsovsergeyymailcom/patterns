package creators.builder;

import creators.builder.cars.Director;
import creators.builder.cars.FordMondeo;
import creators.builder.model.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new FordMondeo());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
