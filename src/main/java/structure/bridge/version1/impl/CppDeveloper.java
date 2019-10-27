package structure.bridge.version1.impl;

import structure.bridge.version1.interfaces.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes code ..");
    }
}
