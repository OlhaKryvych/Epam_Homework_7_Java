package com.epam.lesson8;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tradius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius*radius);
    }
}
