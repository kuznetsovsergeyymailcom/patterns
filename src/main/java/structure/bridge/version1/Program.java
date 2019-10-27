package structure.bridge.version1;

import structure.bridge.version1.interfaces.Developer;

public abstract class Program {

    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
