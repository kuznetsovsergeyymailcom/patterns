package structure.decorator.impl;

import structure.decorator.interfaces.PrinterInterface;

public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface printerInterface) {
        super(printerInterface);
    }

    public void print() {
        System.out.print("[");
        super.print();
    }
}

