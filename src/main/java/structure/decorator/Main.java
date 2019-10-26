package structure.decorator;

import structure.decorator.example2.impl.concreteBeverage.Coffee;
import structure.decorator.example2.impl.decorators.Chocolate;
import structure.decorator.example2.impl.decorators.Milk;
import structure.decorator.example2.interfaces.Beverage;

public class Main {

    public static void main(String[] args) {
//        PrinterInterface printerInterface = new QuotesDecorator(
//                new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hi"))));
//        printerInterface.print();


        Beverage beverage = new Chocolate(20, new Milk(30, new Coffee(50)));
        System.out.println(beverage.cost());
    }
}
