public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        String text = "some text";
        int year = 1601;

        System.out.println("***********************");
        System.out.println("Проверяем функцию checkSum");
        System.out.println("Передали числа: "+a+" и "+b+"; функция вернула значение: "+checkSum(a, b));
        System.out.println("***********************");

        System.out.println("Проверяем функцию checkPositiveOrNegative");
        checkPositiveOrNegative(b);
        System.out.println("***********************");

        System.out.println("Проверяем функцию checkNegativeNumber");
        System.out.println("Передали число: "+a+"; функция вернула значение: "+checkNegativeNumber(a));
        System.out.println("***********************");

        System.out.println("Проверяем функцию multiplePrintText");
        multiplePrintText(text, b);
        System.out.println("***********************");

        System.out.println("Проверяем функцию checkLeapYear");
        if (checkLeapYear(year)) {
            System.out.println(year +" - виоскосный год!");
        } else {
            System.out.println(year + " не високсоный год.");
        }
        System.out.println("***********************");
    }

    public static boolean checkSum(int a, int b) {
        return a + b > 10 && a + b < 20;
    }

    public static void checkPositiveOrNegative(int number) {
        if (number < 0) {
            System.out.println(number +" - отрицательное число!");
        } else {
            System.out.println(number +" - положительное число!");
        }
    }

    public static boolean checkNegativeNumber(int number) {
        return number < 0;
    }

    public static void multiplePrintText(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
