package net.projecteuler;

/**
 * <B>Задача:</B>
 * <p/>
 * Простые делители числа 13195 - это 5, 7, 13 и 29.
 * <p/>
 * Какой самый большой делитель числа 600851475143, являющийся простым числом?
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p/>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long counter = 1;
        while (counter != n) {
            counter++;
            if (n % counter == 0) {
                n /= counter;
                System.out.println(counter);
                counter = 1;
            }
        }
    }
}
