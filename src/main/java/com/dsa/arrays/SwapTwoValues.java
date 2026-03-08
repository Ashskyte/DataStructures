package com.dsa.arrays;

/**
 * Swap Two Values without using a Temporary Variable
 * 
 * Problem: Swap two integer values without using a third temporary variable.
 * 
 * Algorithm Explanation:
 * Uses arithmetic operations (addition and subtraction) to swap values.
 * 
 * Mathematical Approach:
 * Initial: a = 10, b = 20
 * 
 * Step 1: a = a + b
 *         a = 10 + 20 = 30 (a now holds sum of both)
 *         
 * Step 2: b = a - b
 *         b = 30 - 20 = 10 (b now has original value of a)
 *         
 * Step 3: a = a - b
 *         a = 30 - 10 = 20 (a now has original value of b)
 * 
 * Final: a = 20, b = 10 (swapped successfully!)
 * 
 * Why this works:
 * - Step 1 stores the sum in 'a'
 * - Step 2 subtracts original 'b' from sum to get original 'a', stores in 'b'
 * - Step 3 subtracts new 'b' (original 'a') from sum to get original 'b', stores in 'a'
 * 
 * Alternative Methods:
 * - XOR method: a = a ^ b; b = a ^ b; a = a ^ b;
 * - Using multiplication/division (not recommended due to overflow/division by zero)
 * 
 * Time Complexity: O(1) - Constant time operations
 * Space Complexity: O(1) - No extra space used
 * 
 * Note: This method can cause integer overflow for large values
 */
public class SwapTwoValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before Swapping");
        System.out.println("a=" + a);  // a = 10
        System.out.println("b=" + b);  // b = 20
        
        // Swap logic using arithmetic operations (no temp variable)
        a = a + b;  // Step 1: a = 30 (stores sum)
        b = a - b;  // Step 2: b = 30 - 20 = 10 (extracts original a)
        a = a - b;  // Step 3: a = 30 - 10 = 20 (extracts original b)
        
        System.out.println("After Swapping");
        System.out.println("a=" + a);  // a = 20
        System.out.println("b=" + b);  // b = 10
    }
}
