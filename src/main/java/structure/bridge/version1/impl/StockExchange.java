package structure.bridge.version1.impl;

import structure.bridge.version1.Program;
import structure.bridge.version1.interfaces.Developer;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange, someone writes code");
        developer.writeCode();
    }
}
