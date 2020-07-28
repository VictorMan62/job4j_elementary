package ru.job4j;

    public class Calculate {

            public static int calc(int a, int b, int c, int x) {
                return a * x * x + b * x + c;
            }

            public static void main(String[] args) {
                int a = 10;
                int b = 0;
                int c = 0;
                int x = 1;
                int rsl1 = Calculate.calc(a, b, c, x);
                int rsl2 = Calculate.calc(a, b, c, x);
                int rsl3 = Calculate.calc(a, b, c, x);
                int rsl4 = Calculate.calc(a, b, c, x);
                System.out.println(rsl1);
                System.out.println(rsl2);
                System.out.println(rsl3);
                System.out.println(rsl4);
            }
}
