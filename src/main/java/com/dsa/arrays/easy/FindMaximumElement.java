package com.dsa.arrays.easy;

public class FindMaximumElement {
    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};
        System.out.println(findLargest(arr));
    }

    private static int findLargest(int[] arr) {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
