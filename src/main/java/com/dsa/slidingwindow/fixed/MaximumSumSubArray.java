package com.dsa.slidingwindow.fixed;

public class MaximumSumSubArray {

    /*
    Given an array of integers arr[] and an integer k, find the maximum possible sum among all contiguous subarrays of size exactly k.
A subarray is a sequence of consecutive elements from the original array. Return the maximum sum that can be obtained from any such subarray of length k.

Examples:

Input  : arr[] = [100, 200, 300, 400],  k = 2
Output : 700
Explanation: We get maximum sum by adding subarray [300,400] of size 2

Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output : 39
Explanation: We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.

Input  : arr[] = [2, 3], k = 1
Output : 3
Explanation: The subarrays of size 1 are [2] and [3]. The maximum sum is 3.
     */

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(arr, k));
    }

    private static int maxSubarraySum(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (end < arr.length) {

            sum += arr[end];

            if (end - start + 1 < k) {
                end++;
            }
            if (end - start + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[start];
                start++;
                end++;

            }

        }
        return maxSum;
    }
}
