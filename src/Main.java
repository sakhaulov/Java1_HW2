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

    /*
    Метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.
    */
    public static boolean checkSum(int a, int b) {
        return a + b > 10 && a + b < 20;
    }

    /*
    Метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    */
    public static void checkPositiveOrNegative(int number) {
        if (number < 0) {
            System.out.println(number +" - отрицательное число!");
        } else {
            System.out.println(number +" - положительное число!");
        }
    }

    /*
    Метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    public static boolean checkNegativeNumber(int number) {
        return number < 0;
    }

    /*
    Метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз.
    */
    public static void multiplePrintText(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    /*
    Метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    */
    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
