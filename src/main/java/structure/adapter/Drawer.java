package structure.adapter;

import structure.adapter.impl.VectorRasterGraphics;
import structure.adapter.interfaces.VectorGraphicsInterface;

public class Drawer extends VectorRasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
