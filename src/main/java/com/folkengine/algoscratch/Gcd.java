package com.folkengine.algoscratch;

public class Gcd {
    public static int go(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
