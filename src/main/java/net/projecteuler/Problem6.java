package net.projecteuler;

/**
 * <B>Задача:</B>
 * <p/>
 * Сумма квадратов первых десяти натуральных чисел
 * 12 + 22 + ... + 102 = 385
 * <p/>
 * Квадрат суммы первых десяти натуральных чисел
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * <p/>
 * Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел составляет 3025 − 385 = 2640.
 * <p/>
 * Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * <p/>
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * <p/>
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p/>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        // the square of the sum include the sum of the squares, so we should calculate only second part of sum.
        // (x + y + z...)^2 = x^2 + y^2 + z^2 + xy + xz + yz...
        int result = 0;
        int iterations = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i != j) {
                    iterations++;
                    result += i * j;
                }
            }
        }
        System.out.println("Result: " + result);
        System.out.println("Iterations: " + iterations);
    }
}
