package structure.adapter;

import structure.adapter.interfaces.VectorGraphicsInterface;

public class Main {

    public static void main(String[] args) {
        VectorGraphicsInterface vectorGraphicsInterface = new Drawer();
        vectorGraphicsInterface.drawLine();
        vectorGraphicsInterface.drawSquare();

    }
}
