package structure.composite;

import structure.composite.interfaces.Shape;
import structure.composite.model.Circle;
import structure.composite.model.Square;
import structure.composite.model.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Circle();
        Shape shape3 = new Circle();

        Shape shape4 = new Triangle();
        Shape shape5 = new Triangle();
        Shape shape6 = new Triangle();

        Shape shape7 = new Square();
        Shape shape8 = new Square();
        Shape shape9 = new Square();

        Composite composite = new Composite();
        composite.addComponent(shape1);
        composite.addComponent(shape2);
        composite.addComponent(shape3);
        composite.addComponent(shape4);
        composite.addComponent(shape5);
        composite.addComponent(shape6);
        composite.addComponent(shape7);
        composite.addComponent(shape8);
        composite.addComponent(shape9);

        composite.printComponents();
    }
}
