package structure.facade.parts;

public class Power {

    private boolean powerIsOn = false;

    public void switchStateOfPower(){
        powerIsOn = !powerIsOn;
    }

    public boolean getPowerState(){
        return this.powerIsOn;
    }
}
