package structure.decorator.impl;

import structure.decorator.interfaces.PrinterInterface;

public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface printerInterface) {
        super(printerInterface);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
