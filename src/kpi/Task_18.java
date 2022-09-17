package kpi;

import static java.lang.System.out;

public class Task_18 {

    public static void main(String[] args) {
        out.println("\nЗавдання 18\nРезультат перевірки = " + task18(2, 5, 3));
    }

    public static boolean task18(double a, double b, double c) {
        double discriminator = (Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + (Math.sqrt(discriminator))) / (2 * a);
        double x2 = (-b - (Math.sqrt(discriminator))) / (2 * a);

        return ((x1 % 1 == 0) && (x2 % 1 == 0));
    }
}
