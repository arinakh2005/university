package kpi;

import static java.lang.System.out;

public class Task_13 {

    public static void main(String[] args) {
        out.println("\nЗавдання 13");
        task13(213);
    }

    public static void task13(int number) {
        Object typeArg = number;
        if (typeArg.toString().length() != 3) {
            out.println("Аргумент методу не коректний!");
            return;
        }

        String numberStr = Integer.toString(number);
        int result1 = Integer.parseInt(numberStr.substring(2) + numberStr.substring(0, 2));
        out.printf("Початкове значення = %d\nТрансформоване число = %d\n", number, result1);

        double square = Math.sqrt(result1);
        out.printf("Квадратний корінь числа %d = %.2f\n", result1, square);
    }
}
