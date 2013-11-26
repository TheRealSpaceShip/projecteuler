package net.projecteuler;

/**
 *
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
