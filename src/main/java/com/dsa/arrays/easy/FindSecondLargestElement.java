package com.dsa.arrays.easy;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 4, 100};
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
