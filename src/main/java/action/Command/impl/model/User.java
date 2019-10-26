package action.Command.impl.model;

import action.Command.interfaces.Command;

public class User {

     Command start;
     Command stop;
     Command restart;

    public User(Command start, Command stop, Command restart) {
        this.start = start;
        this.stop = stop;
        this.restart = restart;
    }

    public void startComputer(){
        start.execute();
    }

    public void stopComputer(){
        stop.execute();
    }

    public void restartComputer(){
        restart.execute();
    }
}
