package com.epam.lesson8;

public class Shape {
    private String color;

    public Shape() {}
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ",\tcolor = " + color;
    }

    public double calcArea(){
        return 0.0;
    }
}
