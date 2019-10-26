package creators.factoryMethod;

import creators.factoryMethod.makers.DigitalWatchMaker;
import creators.factoryMethod.makers.RomeWatchMaker;
import creators.factoryMethod.interfaces.Watch;

public class Main {

    public static void main(String[] args) {
        Watch watch = getWatchByName("digital");
        watch.showClock();
    }

    public static Watch getWatchByName(String name){
        switch(name){
            case "digital": return new DigitalWatchMaker().createWatch();
            case "rome": return new RomeWatchMaker().createWatch();
            default: throw new RuntimeException("unknown watch type");
        }
    }
}
