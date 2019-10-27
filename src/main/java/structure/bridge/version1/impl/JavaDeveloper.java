package structure.bridge.version1.impl;

import structure.bridge.version1.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes code ...");
    }
}
