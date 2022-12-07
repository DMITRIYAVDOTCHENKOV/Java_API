package org.example.lesson1;

public class Lesson1 {

    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digt = n % 10;
            prod = prod * digt;
            sum = sum + digt;

            n = n / 10;
        }
        return prod - sum;
    }


}
