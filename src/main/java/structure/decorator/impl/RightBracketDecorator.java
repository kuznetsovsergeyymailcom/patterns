package structure.decorator.impl;

import structure.decorator.interfaces.PrinterInterface;

public class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(PrinterInterface printerInterface) {
        super(printerInterface);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }

}
