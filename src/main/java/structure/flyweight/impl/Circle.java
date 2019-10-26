package structure.flyweight.impl;

import structure.flyweight.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing circle by coordinates x: " + x + ", y: " + y);
    }
}
