package action.Command.impl;

import action.Command.interfaces.Command;

public class StopCommand implements Command {
    Comp comp;

    public StopCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.stop();
    }
}
