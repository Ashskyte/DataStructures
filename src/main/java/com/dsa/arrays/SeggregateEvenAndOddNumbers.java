package com.dsa.arrays;
import java.util.Arrays;
public class SeggregateEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3,0,0,5};
        segregateEvenOdd(arr);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }

    private static void segregateEvenOdd(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]%2==0){
                left++;
            }
            else if(arr[left%2]!=0&& arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]%2!=0&&arr[right]%2!=0){
                right--;
            }
        }
    }
}
