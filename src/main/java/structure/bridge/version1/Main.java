package structure.bridge.version1;

import structure.bridge.version1.impl.BankSystem;
import structure.bridge.version1.impl.CppDeveloper;
import structure.bridge.version1.impl.JavaDeveloper;
import structure.bridge.version1.impl.StockExchange;

public class Main {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())};

        for(Program program : programs)
            program.developProgram();
    }
}
