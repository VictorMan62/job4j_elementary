package ru.job4j;

    public class TrgArea {
        public static double geron(double a, double b, double c) {
            double p = (a + b + c) / 2;
            double hs = p * (p - a) * (p - b) * (p - c);
            return Math.sqrt(hs);
        }

        public static double school(double l, double w) {
            return (l * w) / 2;
        }

        public static void main(String[] args) {
            double rsl1 = TrgArea.geron(2, 2, 2);
            double rsl2 = TrgArea.school(3, 5);
            System.out.println("Площадь треугольника: ");
            System.out.println("1. по формуле Герона: если длина всех сторон фигуры = 2 см., то площадь фигуры будет = " + rsl1);
            System.out.println("2. школьный вариант: если основание = 5см., а высота = 3см., то площадь фигуры будет = " + rsl2);
        }
}