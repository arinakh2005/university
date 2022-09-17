// Завд. 2. Знайдіть суму цифр тризначного числа, його квадратний корінь і найближче до кореня ціле.
// Завд. 6. Дано 2 довжини сторін трикутника і кут між ними в градусах. Знайдіть площу.
// Завд.13. Дано ціле тризначне число. У ньому закреслили першу праворуч цифру і приписали її зліва. Вивести отримане число і його квадратний корінь.
// Завд.18. Квадратне рівняння задано дійсними коефіцієнтами A, B, C. Перевірити, чи має воно цілі корінні.

package kpi;

import static java.lang.System.out;
import static kpi.Task_2.task2;
import static kpi.Task_6.task6;
import static kpi.Task_13.task13;
import static kpi.Task_18.task18;

public class Main {

    public static void main(String[] args) {
        out.println("Завдання 2");
        task2(123);

        out.println("\nЗавдання 6");
        task6(20, 2, 30);

        out.println("\nЗавдання 13");
        task13(213);

        out.println("\nЗавдання 18\nРезультат перевірки = " + task18(2, 5, 3));
    }
}
