package net.projecteuler;

/**
 *
 */
public class Problem2 {
    public static void main(String[] args) {

        int sum = 0;
        int current = 1;
        int previous = 1;
        int tempPrev ;
        while (current < 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }
            tempPrev = current;
            current = current + previous;
            previous = tempPrev;
        }
        System.out.println(sum);
    }
}
