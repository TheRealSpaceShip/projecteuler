package net.projecteuler;

/**
 * <B>Задача:</B>
 * <p/>
 * 2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
 * <p/>
 * Какое самое маленькое число делится нацело на все числа от 1 до 20?
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p/>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        boolean answer = false;
        for (int i = 1; ; i++) {

            for (int j = 1; j <= 20; j++) {
                if (isDividable(i, j)) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
            if (answer) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isDividable(int dividend, int divider) {
        return dividend % divider == 0;
    }
}
