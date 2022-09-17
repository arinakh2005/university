package kpi;

import static java.lang.System.out;

public class Task_2 {

    public static void main(String[] args) {
        out.println("Завдання 2");
        task2(123);
    }

    public static void task2(int number) {
        int sum = 0, squareInt = 0;
        double square = 0.0;
        int numberTemp = number;

        Object typeArg = number;
        if (typeArg.toString().length() != 3) {
            out.println("Аргумент методу не коректний!");
            return;
        }

        while (numberTemp > 0) {
            sum = sum + numberTemp % 10;
            numberTemp = numberTemp / 10;
        }
        out.printf("Сума цифр числа %d = %d\n", number, sum);

        square = Math.sqrt(number);
        out.println("Квадратний корінь числа = " + square);

        squareInt = (int) Math.round(square);
        out.println("Найближче до кореня ціле = " + squareInt);
    }
}
