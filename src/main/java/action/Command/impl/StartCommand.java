package action.Command.impl;

import action.Command.interfaces.Command;

public class StartCommand implements Command {
    Comp comp;

    public StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
