package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfRightLeaveNodesInIterativeWay {
    public static void main(String[] args) {
        BSTNode node = new BSTNode(1);
        node.left = new BSTNode(2);
        node.right = new BSTNode(3);
        node.left.left = new BSTNode(4);
        node.left.right = new BSTNode(5);
        node.right.right = new BSTNode(6);
        int sum = 0;
        System.out.println(sumOfRightLeaveNodesIterative(node));
    }

    private static int sumOfRightLeaveNodesIterative(BSTNode node) {
        Queue<BSTNode> queue = new LinkedList<>();
        int sum = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            BSTNode temp = queue.poll();


            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {


                if (temp.right.left == null && temp.right.right == null) {
                    sum += temp.right.data;
                }
                queue.offer(temp.right);

            }


        }

        return sum;
    }
}
