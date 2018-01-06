package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double base;
    double height;
    String shp = "triangle";
    double field;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shp;
    }
    @Override
    public double getField() {
        double field = 0.5 * base * height;
        return field;
    }
}
