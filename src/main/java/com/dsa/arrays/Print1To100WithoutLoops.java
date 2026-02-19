package com.dsa.arrays;

public class Print1To100WithoutLoops {
    public static void main(String[] args) {
        printNumbers(100);
    }
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.print(n +" ");
    }
}
