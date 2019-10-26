package structure.flyweight.impl;

import structure.flyweight.interfaces.Shape;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightShapeFactory {

    private Map<String, Shape> stringShapeMap = new HashMap<>();

    public Shape getShapeByName(String name){
        Shape shape = stringShapeMap.get(name);
        if(shape == null){
            switch (name){
                case "circle": shape = new Circle(); break;
                case "square": shape = new Square(); break;
                case "triangle": shape = new Triangle(); break;
            }
            stringShapeMap.put(name, shape);
        }

        return shape;
    }
}
