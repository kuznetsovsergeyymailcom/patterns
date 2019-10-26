package overs.delegate.impl;

import overs.delegate.interfaces.Graphics;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
