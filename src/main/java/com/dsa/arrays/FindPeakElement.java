package com.dsa.arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {-3, -4, 5, 1, 0};
        System.out.println(peakElement(arr));
    }

    private static int peakElement(int[] arr) {
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
        int n = arr.length;
        boolean left=true;
        boolean right=true;

        for (int i = 0; i < n; i++) {
            // Check for element to the left
            if(i>0&&arr[i]<=arr[i-1]){
                left=false;
            }
            if(i<n-1&&arr[i]<=arr[i+1]){
                right=false;
            }
            if(left&right){
                return i;
            }

        }
        return 0;
    }
}
