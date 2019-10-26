package overs.delegate.impl;

import overs.delegate.interfaces.Graphics;

public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
