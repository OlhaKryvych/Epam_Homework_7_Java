package com.epam.lesson8;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tradius = " + radius;
    }

    @Override
    public double calcArea() {
        double square = Math.PI * (radius*radius);
        return square;
    }
}
