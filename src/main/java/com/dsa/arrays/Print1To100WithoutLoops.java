package com.dsa.arrays;

/**
 * Print Numbers from 1 to N without using Loops
 * 
 * Problem: Print numbers from 1 to N without using any loop constructs (for, while, do-while).
 * 
 * Algorithm Explanation:
 * Uses recursion to achieve the same effect as a loop.
 * 
 * How it works:
 * 1. Base case: If n == 0, stop recursion (return)
 * 2. Recursive case: Call printNumbers(n-1) first, then print n
 * 
 * Execution flow for n=5:
 * printNumbers(5) -> printNumbers(4) -> printNumbers(3) -> printNumbers(2) -> printNumbers(1) -> printNumbers(0) [returns]
 * Then prints: 1, 2, 3, 4, 5 (in ascending order due to print after recursive call)
 * 
 * Key Concept:
 * - By placing the print statement AFTER the recursive call, we print in ascending order
 * - If print was BEFORE recursive call, it would print in descending order (5, 4, 3, 2, 1)
 * 
 * Time Complexity: O(n) - n recursive calls
 * Space Complexity: O(n) - Recursion stack depth
 */
public class Print1To100WithoutLoops {
    public static void main(String[] args) {
        printNumbers(100);
    }
    
    /**
     * Recursively prints numbers from 1 to n
     * 
     * @param n The upper limit (prints from 1 to n)
     */
    public static void printNumbers(int n) {
        // Base case: Stop when n reaches 0
        if (n == 0) {
            return;
        }
        
        // Recursive call with n-1 (goes down to 1)
        printNumbers(n - 1);
        
        // Print current number (after recursive call completes)
        // This ensures numbers are printed in ascending order: 1, 2, 3, ..., n
        System.out.print(n + " ");
    }
}
