package com.dsa.arrays;

import java.util.PriorityQueue;

/**
 * Find Kth Largest Element in an Array using Min-Heap
 * 
 * Problem: Given an array and an integer K, find the Kth largest element.
 * 
 * Algorithm Explanation:
 * Uses a Min-Heap (Priority Queue) of size K to efficiently find the Kth largest element.
 * 
 * Approach:
 * 1. Create a min-heap of size K
 * 2. Add first K elements to the heap
 * 3. For remaining elements:
 *    - If element > heap's minimum (peek), remove min and add this element
 * 4. After processing all elements, the root of heap is the Kth largest
 * 
 * Why this works:
 * - Min-heap maintains K largest elements seen so far
 * - The smallest among these K largest is at the root
 * - This smallest element is exactly the Kth largest element
 * 
 * Example: arr = {12, 3, 5, 7, 19}, K = 3
 * After processing: heap = {7, 12, 19}
 * Kth largest (3rd largest) = 7
 * 
 * Time Complexity: O(n log k) - n elements, each heap operation is O(log k)
 * Space Complexity: O(k) - Heap stores K elements
 */
public class KthLargestElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 7, 19};
        int K = 3;
        System.out.println(kthLargest(arr, K));
    }

    /**
     * Finds the Kth largest element using a min-heap approach
     * 
     * @param arr Input array
     * @param k The position of largest element to find (1-indexed)
     * @return The Kth largest element
     */
    private static int kthLargest(Integer[] arr, int k) {
        // Create a min-heap (PriorityQueue) of size k
        // Min-heap keeps smallest element at the root
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        // Add first k elements to the heap
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        
        // Process remaining elements
        for (int i = k; i < arr.length; i++) {
            // If current element is larger than smallest in heap
            if (arr[i] > pq.peek()) {
                pq.poll();      // Remove the smallest element
                pq.add(arr[i]); // Add current larger element
            }
            // This maintains k largest elements in the heap
        }

        // The root of min-heap now contains the Kth largest element
        // (smallest among the K largest elements)
        return pq.poll();
    }
}
