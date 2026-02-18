package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.ArrayList;

public class PreOrderTraversalWithRecursion {
    public static void main(String[] args) {
        // Create binary tree
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
        BSTNode root = new BSTNode(1);
        root.left = new BSTNode(2);
        root.right = new BSTNode(3);
        root.left.left = new BSTNode(4);
        root.left.right = new BSTNode(5);
        root.right.right = new BSTNode(6);

        ArrayList<Integer> res = new ArrayList<>();
        preOrder(root, res);

        for(int BSTNode : res)
            System.out.print(BSTNode + " ");
    }

    private static void preOrder(BSTNode root, ArrayList<Integer> res) {
        // Base case
        if(root==null)
            return;
        res.add(root.data);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
}
