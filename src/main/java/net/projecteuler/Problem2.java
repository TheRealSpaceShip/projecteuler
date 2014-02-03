package net.projecteuler;

/**
 * <B>Задача:</B>
 * <p/>
 * Каждые следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
 * <p/>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p/>
 * Найдите сумму всех чётных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 * <p/>
 * <p/>
 * <B>Оригинал:</B>
 * <p/>
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * <p/>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p/>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {
    public static void main(String[] args) {
        int iterations = 0;
        int result = 0;
        int current = 1;
        int previous = 1;
        int tempPrev;
        while (current < 4000000) {
            iterations++;
            if (current % 2 == 0) {
                result += current;
            }
            tempPrev = current;
            current = current + previous;
            previous = tempPrev;
        }
        System.out.println("Result: " + result);
        System.out.println("Iterations: " + iterations);
    }
}
