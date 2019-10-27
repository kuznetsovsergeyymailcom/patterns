package action.state;

import action.state.impl.Sleeping;
import action.state.model.Developer;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
