package creators.builder.cars;

import creators.builder.model.Transmition;

public class FordMondeo extends CarBuilder {

    public void setModel(){
        this.car.setModel("Ford Mondeo");
    }

    public void setTransmition(){
        this.car.setTransmition(Transmition.AUTO);
    }
    public void setMaxSpeed(){
        this.car.setMaxSpeed(210);
    }


}
