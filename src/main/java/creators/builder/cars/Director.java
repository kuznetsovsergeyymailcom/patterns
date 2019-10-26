package creators.builder.cars;

import creators.builder.model.Car;

public class Director {

    CarBuilder carBuilder;
    public void setCarBuilder(CarBuilder builder){
        this.carBuilder = builder;
    }

    public Car buildCar(){
        carBuilder.createCar();
        carBuilder.setModel();
        carBuilder.setTransmition();
        carBuilder.setMaxSpeed();
        return carBuilder.getCar();
    }
}
