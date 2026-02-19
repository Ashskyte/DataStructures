package com.dsa.arrays;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 7, 19};
        int K = 3;
        System.out.println(kthLargest(arr, K));
    }

    private static int kthLargest(Integer[] arr, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(3);

        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }




        return pq.poll();
    }
}
