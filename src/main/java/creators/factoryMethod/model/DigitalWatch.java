package creators.factoryMethod.model;

import creators.factoryMethod.interfaces.Watch;

import java.util.Date;

public class DigitalWatch implements Watch {


    @Override
    public void showClock() {
        System.out.println(new Date());
    }
}
