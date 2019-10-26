package creators.builder.cars;

import creators.builder.model.Transmition;

public class Subaru extends CarBuilder {
    @Override
    void setModel() {
        this.car.setModel(this.getClass().getCanonicalName());
    }

    @Override
    void setTransmition() {
        this.car.setTransmition(Transmition.AUTO);
    }

    @Override
    void setMaxSpeed() {
        this.car.setMaxSpeed(100);
    }
}
