package ru.job4j;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Идельным весом для мужчины ростом 187 см. будет " + man + " кг.");
        System.out.println("Идельным весом для женщины ростом 187 см. будет " + woman + " кг.");
    }

}
