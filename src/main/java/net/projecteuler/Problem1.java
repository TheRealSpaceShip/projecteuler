package net.projecteuler;

/**
 * <B>Задача:</B>
 * <p/>
 * Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел - 23.
 * <p/>
 * Найдите сумму всех чисел меньше 1000 кратных 3 или 5.
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p/>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.println(sum);
    }
}