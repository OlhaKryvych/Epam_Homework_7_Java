package com.epam.lesson8;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
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
