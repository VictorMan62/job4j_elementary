package ru.job4j;

    public class TrgArea {
        public static double Geron (double a, double b, double c) {
            double p = (a + b + c) / 2;
            double hs = p * (p - a) * (p - b) * (p - c);
            double rsl = Math.sqrt(hs);
            return rsl;
        }
        public static double School (double l, double w) {
            double rsl2 = (l * w) / 2;
            return rsl2;
        }
        public static void main(String[] args) {
            double rsl = TrgArea.Geron(2, 2, 2);
            double rsl2 = TrgArea.School(3, 5);
            System.out.println("Площадь треугольника: ");
            System.out.println("1. по формуле Герона: если длина всех сторон фигуры = 2 см., то площадь фигуры будет = " + rsl);
            System.out.println("2. школьный вариант: основание = 5см., а высота = 3см., то площадь фигуры будет = " + rsl2);
        }
}