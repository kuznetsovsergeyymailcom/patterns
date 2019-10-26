package action.strategy.impl;

import action.strategy.interfaces.Fly;

public class NonFlyable implements Fly {
    @Override
    public String fly() {

        return "I can't fly";
    }
}
