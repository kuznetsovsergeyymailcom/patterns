package action.state.impl;

import action.state.interfaces.Activity;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("sleeping");

    }
}
