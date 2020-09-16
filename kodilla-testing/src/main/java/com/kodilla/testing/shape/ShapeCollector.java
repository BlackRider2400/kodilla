package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(shapes.contains(shape)){
            shapes.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int n){

        return shapes.get(n);
    }

    public String showFigures(){
        String out = "";

        for(Shape x : shapes){
            out += x.getShapeName() + ", " + x.getField();
            out += "; ";
        }

        return out;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
