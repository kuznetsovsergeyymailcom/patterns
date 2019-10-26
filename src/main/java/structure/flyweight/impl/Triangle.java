package structure.flyweight.impl;

import structure.flyweight.interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing triangle by coordinates x: " + x + ", y: " + y);
    }
}
