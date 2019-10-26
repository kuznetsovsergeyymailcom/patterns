package action.observer.impl;

import action.observer.interfaces.Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {


    @Override
    public void handleEvent(int temperature, int pressure) {

        try {
            File tempFile = File.createTempFile("ObserverFile", "_txt");
            PrintWriter printWriter = new PrintWriter(tempFile);
            printWriter.write("Observer has new notification: \ttemperature is: " + temperature + ", pressure is: " + pressure);
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
