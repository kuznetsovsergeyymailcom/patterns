package action.observer.impl;

import action.observer.interfaces.Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Observer has new notification: \ttemperature is: " + temperature + ", pressure is: " + pressure);
    }
}
