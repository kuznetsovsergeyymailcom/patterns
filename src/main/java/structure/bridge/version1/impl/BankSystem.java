package structure.bridge.version1.impl;

import structure.bridge.version1.Program;
import structure.bridge.version1.interfaces.Developer;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system someone writes code");
        developer.writeCode();
    }
}
