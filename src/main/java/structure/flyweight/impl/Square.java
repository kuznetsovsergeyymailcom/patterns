package structure.flyweight.impl;

import structure.flyweight.interfaces.Shape;

public class Square implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing square by coordinates x: " + x + ", y: " + y);
    }
}
