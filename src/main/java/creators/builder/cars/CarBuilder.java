package creators.builder.cars;

import creators.builder.model.Car;

public abstract class CarBuilder {
//
//    private String model = "default model";
//    private Transmition transmition = Transmition.MANUAL;
//    private int maxSpeed = 120;
//
//
//    public CarBuilder setModel(String model){
//        this.model = model;
//        return this;
//    }
//
//    public CarBuilder setTransmition(Transmition transmition){
//        this.transmition = transmition;
//        return this;
//    }
//
//    public CarBuilder setMaxSpeed(int maxSpeed){
//        this.maxSpeed = maxSpeed;
//        return this;
//    }
//
//    public Car buildCar(){
//        Car car = new Car();
//        car.setMaxSpeed(this.maxSpeed);
//        car.setModel(this.model);
//        car.setTransmition(this.transmition);
//        return car;
//    }

    Car car;
    void createCar(){this.car = new Car();}

    abstract void setModel();
    abstract void setTransmition();
    abstract void setMaxSpeed();

    Car getCar(){return car;}
}

