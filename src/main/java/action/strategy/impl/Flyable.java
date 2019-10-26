package action.strategy.impl;

import action.strategy.interfaces.Fly;

public class Flyable implements Fly {
    @Override
    public String fly() {

        return "I can fly";
    }


}
