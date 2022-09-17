package kpi;

import static java.lang.System.out;

public class Task_6 {

    public static void main(String[] args) {
        out.println("\nЗавдання 6");

        double a = 20;
        double b = 2;
        int angle = 30;

        out.println("a = " + a + "\nb = " + b + "\nangle = " + angle);
        task6(a, b, angle);
    }

    public static void task6(double a, double b, int angle) {
        if (a < 0 || b < 0) {
            out.println("Аргумент методу не коректний!");
            return;
        }
        double area = 0.5 * a * b * Math.sin(Math.toRadians(angle));
        out.printf("Площа = %.2f\n", area);
    }
}
