package com.epam.lesson8;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
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
