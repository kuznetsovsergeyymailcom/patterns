package action.state.impl;

import action.state.interfaces.Activity;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("reading books");
    }
}
