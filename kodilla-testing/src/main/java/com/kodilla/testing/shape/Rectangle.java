package com.kodilla.testing.shape;

public class Rectangle implements Shape{

    private String shapeName;
    private double field;

    public Rectangle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

}
