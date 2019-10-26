package structure.composite.model;

import structure.composite.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("hello i am shape");
    }
}
