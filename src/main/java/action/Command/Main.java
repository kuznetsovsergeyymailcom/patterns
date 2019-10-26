package action.Command;

import action.Command.impl.Comp;
import action.Command.impl.RestartCommand;
import action.Command.impl.StartCommand;
import action.Command.impl.StopCommand;
import action.Command.impl.model.User;

public class Main {

    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new RestartCommand(comp));

        user.startComputer();
        user.stopComputer();
        user.restartComputer();
    }
}
