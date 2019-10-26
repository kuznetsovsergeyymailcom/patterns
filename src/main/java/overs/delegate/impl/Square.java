package overs.delegate.impl;

import overs.delegate.interfaces.Graphics;

public class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("square");
    }
}
