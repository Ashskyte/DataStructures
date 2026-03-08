package com.dsa.arrays;

/**
 * Kadane's Algorithm - Maximum Subarray Sum
 * 
 * Problem: Find the contiguous subarray with the maximum sum.
 * 
 * Algorithm Explanation:
 * Kadane's algorithm uses dynamic programming to find the maximum sum of a contiguous subarray.
 * 
 * Key Idea:
 * - At each position, we decide whether to extend the current subarray or start a new one.
 * - If adding current element to existing sum gives less than the element itself, start fresh.
 * 
 * Example: arr = {1, 2, 3, -2, 5}
 * Step by step:
 * i=0: maxEndingHere=1, result=1
 * i=1: maxEndingHere=3 (1+2), result=3
 * i=2: maxEndingHere=6 (3+3), result=6
 * i=3: maxEndingHere=4 (6-2), result=6
 * i=4: maxEndingHere=9 (4+5), result=9
 * Output: 9
 * 
 * Time Complexity: O(n) - Single pass through array
 * Space Complexity: O(1) - Only using two variables
 */
public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] arr = {-11, 2, 3, -2, 5};
        System.out.println(maxSubArraySum(arr));
    }

    /**
     * Finds the maximum sum of any contiguous subarray using Kadane's Algorithm
     * 
     * @param arr Input array of integers
     * @return Maximum sum of contiguous subarray
     */
    static int maxSubArraySum(int[] arr) {
        // Initialize result with first element (handles all negative arrays)
        int result = arr[0];
        
        // Maximum sum ending at current position
        int maxEndingHere = arr[0];

        // Iterate through array starting from second element
        for (int i = 1; i < arr.length; i++) {
            // Decide: extend the existing subarray or start a new one
            // If arr[i] + maxEndingHere > arr[i], extend the subarray
            // Otherwise, start fresh from current element
            maxEndingHere = Math.max(arr[i] + maxEndingHere, arr[i]);
            
            // Update global maximum if current subarray sum is larger
            result = Math.max(maxEndingHere, result);
        }
        
        return result;
    }
}
