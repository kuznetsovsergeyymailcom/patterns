package structure.bridge.impl;

import structure.bridge.Program;
import structure.bridge.interfaces.Developer;

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
