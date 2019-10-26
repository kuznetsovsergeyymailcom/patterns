package structure.adapter;

import structure.adapter.impl.VectorRasterGraphics;
import structure.adapter.interfaces.VectorGraphicsInterface;

public class DrawerCompositionVersion implements VectorGraphicsInterface {
    VectorRasterGraphics vectorRasterGraphics = null;

    public DrawerCompositionVersion(VectorRasterGraphics vectorRasterGraphics) {
        this.vectorRasterGraphics = vectorRasterGraphics;
    }

    @Override
    public void drawLine() {
        vectorRasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        vectorRasterGraphics.drawRasterSquare();
    }
}
