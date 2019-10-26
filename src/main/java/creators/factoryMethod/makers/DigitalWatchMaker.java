package creators.factoryMethod.makers;

import creators.factoryMethod.interfaces.Watch;
import creators.factoryMethod.interfaces.WatchMaker;
import creators.factoryMethod.model.DigitalWatch;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }


}
