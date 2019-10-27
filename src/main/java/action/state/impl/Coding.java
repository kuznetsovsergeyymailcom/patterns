package action.state.impl;

import action.state.interfaces.Activity;

public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("writing code");

    }
}
