package com.kodilla.testing.shape;

public class Square implements Shape {
    double side;
    String shp = "square";
    double field;

    public Square(double side){
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shp;
    }
    @Override
    public double getField() {
        double field = side * side;
        return field;
    }
}
