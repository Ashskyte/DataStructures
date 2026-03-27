package com.dsa.arrays;

/**
 * Find Peak Element in an Array
 * <p>
 * Problem: A peak element is an element that is greater than its neighbors.
 * Given an array, find the index of any peak element.
 * <p>
 * Example: arr = {-3, -4, 5, 1, 0}
 * Output: 0 (first peak found)
 * Explanation: arr[0] = -3 is a peak because -3 > -4 (right neighbor)
 * Note: Index 2 (value = 5) is also a peak, but algorithm returns first peak found
 * <p>
 * Time Complexity: O(n) - Single pass through array
 * Space Complexity: O(1) - Only using constant extra space
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {23, 5, 1, 20};
        System.out.println(peakElement(arr));
        findPeakElement(arr);
    }

    private static void findPeakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean left = true;
            boolean right = true;

            if (i > 0 && arr[i] < arr[i - 1]) left = false;
            if (i < arr.length - 1 && arr[i] > arr[i + 1]) right = false;
            if (left && right) System.out.println("position is " + i + "and element is " + arr[i]);
        }


    }

    /**
     * Finds the index of a peak element in the array
     * A peak element is greater than both its left and right neighbors
     *
     * @param arr Input array
     * @return Index of the peak element
     */
    private static int peakElement(int[] arr) {
        int n = arr.length;

        // Iterate through each element
        for (int i = 0; i < n; i++) {
            // Flags to check if current element is peak
            boolean left = true;   // Is current element greater than left neighbor?
            boolean right = true;  // Is current element greater than right neighbor?

            // Check if current element is greater than left neighbor
            // If i > 0, we have a left neighbor to compare
            if (i > 0 && arr[i] <= arr[i - 1]) {
                left = false;  // Not greater than left neighbor
            }

            // Check if current element is greater than right neighbor
            // If i < n-1, we have a right neighbor to compare
            if (i < n - 1 && arr[i] <= arr[i + 1]) {
                right = false;  // Not greater than right neighbor
            }

            // If current element is greater than both neighbors, it's a peak
            if (left & right) {
                return i;  // Return the index of peak element
            }
        }

        // Edge case: return 0 if no peak found (shouldn't happen in valid input)
        return 0;
    }
}
