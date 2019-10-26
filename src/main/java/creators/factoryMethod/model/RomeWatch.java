package creators.factoryMethod.model;

import creators.factoryMethod.interfaces.Watch;

public class RomeWatch implements Watch {
    @Override
    public void showClock() {
        System.out.println("VI-XX");
    }
}
