package com.epam.lesson8;

public class Main {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10, 5, "yellow");
        Rectangle rec2 = new Rectangle(2.5, 10.36, "green");
        Rectangle rec3 = new Rectangle(8.75, 15, "orange");
        Rectangle rec4 = new Rectangle(3, 6, "white");

        Circle cir1 = new Circle(5.5, "black");
        Circle cir2 = new Circle(10, "pink");
        Circle cir3 = new Circle(1, "purple");

        Triangle tri1 = new Triangle(10,5, 9, "gold");
        Triangle tri2 = new Triangle(6,6, 3, "blue");

        Shape[] array = new Shape[]{rec1, rec2, rec3, rec4, cir1, cir2, cir3, tri1, tri2};
        printArrayShape(array);
        System.out.println("\nThe common square of all shapes is  " + calculateAllSquares(array));
        printArrayDouble(calculateSumOfTypes(array));

    }

    public static void printArrayShape(Shape[] array){
        if(array == null || array.length < 1){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString() + "\nSquare =  " + array[i].calcArea());
        }
    }

    public static void printArrayDouble(Double[] array){
        if(array == null || array.length < 1){
            return;
        }
        String[] shapes = new String[]{"\nThe sum of squares of rectangles    ",
        "The sum of squares of circles   ", "The sum of squares of triangles   "};
        for(int i = 0; i < array.length; i++){
                System.out.println(shapes[i] + "\t" +array[i]);
        }
    }

    public static Double calculateAllSquares(Shape[] array){
        if(array == null || array.length < 1){
            return null;
        }
        double sum = 0.0;
        for(Shape elem:array){
            sum += elem.calcArea();
        }
        return sum;
    }

    public static Double[] calculateSumOfTypes(Shape[] array){
        if(array == null || array.length < 1){
            return null;
        }
        double sumRectangles = 0;
        double sumCircles = 0;
        double sumTriangles = 0;
        for(Shape elem:array){
             if(elem instanceof Rectangle) {
                 sumRectangles += elem.calcArea();
             }
            if(elem instanceof Circle){
                sumCircles += elem.calcArea();
            }
            if(elem instanceof Triangle){
                sumTriangles += elem.calcArea();
            }
        }
        Double[] sum = new Double[]{sumRectangles, sumCircles, sumTriangles};
        return sum;
    }
}
