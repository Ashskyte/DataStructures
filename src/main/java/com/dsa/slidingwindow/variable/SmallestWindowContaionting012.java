package com.dsa.slidingwindow.variable;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowContaionting012 {
    /*
    Given a string S of size N consisting of the characters 0, 1 and 2,
    the task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2.
     If no such substring exists, then return -1.

Examples:

Input: S = "01212"
Output: 3
Explanation: The substring 012 is the smallest substring that contains the characters 0, 1 and 2.

Input:  S = "12121"
Output: -1
Explanation:  As the character 0 is not present in the string S, therefore no substring containing all the three characters 0, 1 and 2 exists. Hence, the answer is -1 in this case.
     */

    public static void main(String[] args) {
        String S = "01212";
        // Function call
        System.out.print(smallestSubstring(S));
    }

    private static int smallestSubstring(String s) {
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        while (end < s.length()) {
            // Expand window: add current character to map
            char currentChar = s.charAt(end);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            // Contract window: when all 3 characters are present
            while (map.size() == 3) {
                // Update minimum length
                minLength = Math.min(minLength, end - start + 1);

                // Shrink from start
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);

                // Remove character if count becomes 0
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }

                start++;
            }

            end++;
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
