package structure.decorator.impl;

import structure.decorator.interfaces.PrinterInterface;

public abstract class Decorator implements PrinterInterface{
    private PrinterInterface printerInterface;

    public Decorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }

    public void print() {
        printerInterface.print();
    }
}
