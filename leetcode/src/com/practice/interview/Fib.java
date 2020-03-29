package com.practice.interview;

/**
 * 面试题10- I. 斐波那契数列
 * Created by liaoyilang on 29/03/2020.
 */
public class Fib {

    public static void main(String[] args) {


        int n = 45;
        int result = fib(n);
        System.out.println(result);

    }

    private static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        return fib2(n, arr);
    }

    private static int fib2(int n, int[] arr) {

        if (n < 2) {
            return arr[n];
        }

        if (arr[n] > 0) {
            return arr[n];
        }
        arr[n] = (fib2(n - 1, arr) + fib2(n - 2, arr)) % 1000000007;
        return arr[n];
    }
}
