package com.dsa.slidingwindow;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {

        // S1 refers to object in the Heap Area
        String s1 = new String("GFG");

        // S2 refers to object in the Heap (after concat)
        String s2 = s1.concat("GFG");

        // S3 refers to object in SCP Area after intern()
        String s3 = s2.intern();

        System.out.println(s2 == s3);

        // S4 refers to object in SCP Area
        String s4 = "GFGGFG";

        System.out.println(s3 == s4);
    }
    public static String longestPalindrome(String s) {


        return null;
    }
}
