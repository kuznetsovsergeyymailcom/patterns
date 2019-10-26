package structure.composite.model;

import structure.composite.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("hello i am circle");
    }
}
