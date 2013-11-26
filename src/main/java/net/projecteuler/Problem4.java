package net.projecteuler;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <B>Задача:</B>
 * <p/>
 * Число-палиндром с обеих сторон (справа и слева) читается одинаково. Самое большое число-палиндром, полученное произведением двух двухзначных чисел – 9009 = 91 × 99.
 * <p/>
 * Найдите самый большой палиндром, полученный произведением двух трёхзначных чисел.
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        Set<Integer> palindromes = new HashSet<>();
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int result = i * j;
                if (isPalindrome(result)) {
                    System.out.println(result + " = " + i + " * " + j);
                    palindromes.add(result);
                }
            }
        }
        Iterator<Integer> iterator = palindromes.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int val = iterator.next();
            if (val > max) {
                max = val;
            }
        }
        System.out.println(max);
    }

    private static String revert(String str) {
        return str.length() > 1 ? str.substring(str.length() - 1) + revert(str.substring(0, str.length() - 1)) : str;
    }

    private static boolean isPalindrome(int n) {
        return isPalindrome(String.valueOf(n));
    }

    private static boolean isPalindrome(String n) {
        return n.substring(0, n.length() / 2).equals(revert(n.substring(n.length() / 2 + (n.length() % 2 == 0 ? 0 : 1))));
    }
}
