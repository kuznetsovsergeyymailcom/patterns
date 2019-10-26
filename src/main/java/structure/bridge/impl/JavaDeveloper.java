package structure.bridge.impl;

import structure.bridge.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes code ...");
    }
}
