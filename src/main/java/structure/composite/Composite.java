package structure.composite;

import structure.composite.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape shape){
        components.add(shape);
    }
    public void removeComponent(Shape shape){
        components.remove(shape);
    }

    public void printComponents(){
        for(Shape shape : components){
            shape.draw();
        }
    }
}
