package action.observer;

import action.observer.impl.ConsoleObserver;
import action.observer.impl.FileObserver;
import action.observer.impl.MeteoStation;

public class Main {

    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        ConsoleObserver consoleObserver = new ConsoleObserver();
        FileObserver fileObserver = new FileObserver();

        meteoStation.addObserver(consoleObserver);
        meteoStation.addObserver(fileObserver);

        meteoStation.setMesurements(20, 760);
        meteoStation.setMesurements(32, 743);
    }
}
