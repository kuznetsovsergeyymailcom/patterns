package structure.bridge.impl;

import structure.bridge.Program;
import structure.bridge.interfaces.Developer;

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
