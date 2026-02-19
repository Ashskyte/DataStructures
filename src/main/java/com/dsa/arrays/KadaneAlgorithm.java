package com.dsa.arrays;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        System.out.println(maxSubArraySum(arr));
    }

    static int maxSubArraySum(int[] arr) {
        // Code here
        int result = arr[0];
        int maxEndingHere = arr[0];


        for (int i = 1; i < arr.length; i++) {

            maxEndingHere = Math.max(arr[i] + maxEndingHere, arr[i]);
            result = Math.max(maxEndingHere, result);
        }
        return result;
    }
}
