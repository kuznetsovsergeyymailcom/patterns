package structure.flyweight;

import structure.flyweight.impl.Circle;
import structure.flyweight.impl.FlyWeightShapeFactory;
import structure.flyweight.impl.Square;
import structure.flyweight.impl.Triangle;
import structure.flyweight.interfaces.Shape;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape2 = new Triangle();
        Shape shape3 = new Square();

        FlyWeightShapeFactory factory = new FlyWeightShapeFactory();

        Shape circle = factory.getShapeByName("circle");
        System.out.println("Circle hash code: " + circle.hashCode());
        circle.draw(12, 9);

        Shape triangle = factory.getShapeByName("triangle");
        System.out.println("Triangle hash code: " + triangle.hashCode());
        triangle.draw(23, 78);

        Shape square = factory.getShapeByName("square");
        System.out.println("Square hash code: " + square.hashCode());
        square.draw(23, 78);

        System.out.println("----------------------------------------------------");

        Shape circle1 = factory.getShapeByName("circle");
        System.out.println("Circle1 hash code: " + circle1.hashCode());
        circle1.draw(34, 9);

        Shape triangle1 = factory.getShapeByName("triangle");
        System.out.println("Triangle1 hash code: " + triangle1.hashCode());
        triangle1.draw(35, 78);

        Shape square1 = factory.getShapeByName("square");
        System.out.println("Square1 hash code: " + square1.hashCode());
        square1.draw(232, 78);
    }
}
