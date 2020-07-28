package ru.job4j;

/*public class Condition {

        public static void main(String[] args) {
            int first = 10;
            int second = 9;
            boolean result = first > second;
                    System.out.println(result);
            result = first < second;
                    System.out.println(result);
            result = first == second;
                    System.out.println(result);
        }*/
    class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(-2);
        possibleDiv(-3);
        possibleDiv(5);
        possibleDiv(-21);
    }

    @SuppressWarnings("checkstyle:RightCurly")
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is positive");
        }
    }

}
