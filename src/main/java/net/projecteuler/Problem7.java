package net.projecteuler;

import java.util.Arrays;

/**
 * <B>Задача:</B>
 * <p/>
 * Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-ое простое число - 13.
 * <p/>
 * Какое число является 10001-ым простым числом?
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p/>
 * What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {

        int n = 200000;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int i = 2; i*i < n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                for (int j = i*i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int counter = 1;

        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                if (counter == 10002) {
                    System.out.println(counter + ":" + i);
                }
                counter++;
            }
        }
    }
}
