package creators.factoryMethod.makers;

import creators.factoryMethod.interfaces.Watch;
import creators.factoryMethod.interfaces.WatchMaker;
import creators.factoryMethod.model.RomeWatch;

public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
