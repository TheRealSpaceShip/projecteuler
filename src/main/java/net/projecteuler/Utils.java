package net.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Integer> getPrimes(int count) {
        List<Integer> primes = new ArrayList<>(count);
        int number = 2;
        int iterations = 0;
        boolean isPrime;
        while (primes.size() != count) {
            isPrime = true;
            for (int prime : primes) {
                iterations++;
                if (number % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(number);
            number++;
        }
        System.out.println("[Utils] Get primes number iterations: " + iterations);
        return primes;
    }
}
