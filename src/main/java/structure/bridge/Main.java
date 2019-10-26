package structure.bridge;

import structure.bridge.impl.BankSystem;
import structure.bridge.impl.CppDeveloper;
import structure.bridge.impl.JavaDeveloper;
import structure.bridge.impl.StockExchange;

public class Main {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())};

        for(Program program : programs)
            program.developProgram();
    }
}
