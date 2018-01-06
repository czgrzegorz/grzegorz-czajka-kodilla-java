package com.kodilla.testing.shape;

public class Circle implements Shape {
    double radius;
    String shp = "circle";
    double field;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shp;
    }
    @Override
    public double getField() {
        double field = 3.14 * radius * radius;
        return field;
    }
}
