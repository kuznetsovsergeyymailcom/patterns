package action.Command.impl;

import action.Command.interfaces.Command;

public class RestartCommand implements Command {

    Comp comp;

    public RestartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.restart();
    }
}
