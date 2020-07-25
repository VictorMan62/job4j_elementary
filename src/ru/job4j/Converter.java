package ru.job4j;

public class Converter {

    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollars = Converter.rubleToDollar(140);
        double in = 140;
        double expectedeuro = 2;
        double expecteddollar = 2.33;
        double oute = rubleToEuro(in);
        double outd = rubleToDollar(in);
        boolean passede = expectedeuro == oute;
        boolean passedd = expecteddollar == outd;
        System.out.println("140 rubles are 2 euro. Test result : " + passede);
        System.out.println("140 rubles are 2 dollars. Test result : " + passedd);
    }
}
