package com.epam.lesson8;

public class Triangle extends Shape{
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ta = " + a +
                ",\tb = " + b +
                ",\tc = " + c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }
}
