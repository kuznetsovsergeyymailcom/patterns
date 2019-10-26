package structure.bridge.impl;

import structure.bridge.interfaces.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes code ..");
    }
}
