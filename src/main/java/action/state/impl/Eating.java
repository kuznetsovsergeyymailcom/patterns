package action.state.impl;

import action.state.interfaces.Activity;

public class Eating implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("goes to eating");
    }
}
