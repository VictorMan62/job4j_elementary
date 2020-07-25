package ru.job4j;

public class MathFunc {

    public static int func1(int x) {
        return x + x * x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        System.out.println(result1);
    }
}