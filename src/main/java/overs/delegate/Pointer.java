package overs.delegate;

import overs.delegate.interfaces.Graphics;

public class Pointer {

    private Graphics graphics;

    public Pointer(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw(){
        graphics.draw();
    }
}
