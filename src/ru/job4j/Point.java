package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        // A=(X1; Y1)
        // B=(X2; Y2)
        // AB=d
        // d=корень из (X2-X1)в2+(Y2-Y1)в2
        double first = Math.pow(x2-x1, 2);
        double second = Math.pow(y2-y1, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(2, 2, 4, 4);
        double result2 = Point.distance(3, 3, 6, 6);
        System.out.println("distance from A(2, 2) to B(4, 4) = " + result1);
        System.out.println("distance from A(3, 3) to B(6, 6) = " + result2);
    }
}
