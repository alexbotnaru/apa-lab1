package com.company;

public class Main {

    public static void main(String[] args) {
//sirul lui Fibonacci (3 metode)
        System.out.println(fib1(7));
        System.out.println(fib2(10));
        System.out.println(fib3(6));
    }

    static int fib1(int n) {
        if (n < 2) return n;
        else return fib1(n - 1) + fib1(n - 2);
    }

    static int fib2(int n) {
        int i = 1, j = 0, k;
        for (k = 1; k <= n; k++) {
            j = i + j;
            i = j - i;
        }
        return j;
    }

    static int fib3(int n) {
        int i = 1, j = 0, k = 0, h = 1;
        while (n > 0) {
            int t;
            if (n % 2 == 1) {
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
            }
                t = h * h;
                h = 2 * k * h + t;
                k = k * k + t;
                n = n / 2;

        }
        return j;
    }
}
