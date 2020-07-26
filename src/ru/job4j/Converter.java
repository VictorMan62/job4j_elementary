package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollars = Converter.rubleToDollar(140);
//        int in = 140;
//        int expectedeuro = 2;
//        int expecteddollar = 2.33;
//        euro = rubleToEuro(in);
//        dollars = rubleToDollar(in);
//        boolean passede = expectedeuro == oute;
//        boolean passedd = expecteddollar == outd;
        System.out.println("140 rubles are 2 euro. Test result : " + euro);
        System.out.println("140 rubles are 2 dollars. Test result : " + dollars);
    }
}
