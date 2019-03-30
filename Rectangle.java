package com.epam.lesson8;

public class Rectangle extends Shape {
    public double width = 0;
    public double height = 0;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\twidth = " + width +
                ",\theight = " + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

}
