package com.dsa.slidingwindow;

public class PermutationOfPattern {
    /*
    Given two strings txt and pat having lowercase letters, the task is to check if any permutation of pat is a substring of txt.

Examples:

Input: txt = "geeks", pat = "eke"
Output: true
Explanation: "eek" is a permutation of "eke" which exists in "geeks".

Input: txt = "programming", pat = "rain"
Output: false
Explanation: No permutation of "rain" exists as a substring in "programming".

     */

    public static void main(String[] args) {
        String txt = "geeks";
        String pat = "eke";
        if (searchPermutation(txt, pat))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean searchPermutation(String txt, String pat) {

        return false;
    }
}
