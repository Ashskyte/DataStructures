package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.ArrayList;

public class PostOrderTraversalWithRecursion {
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
        postOrder(root, res);

        for(int BSTNode : res)
            System.out.print(BSTNode + " ");
    }

    private static void postOrder(BSTNode root, ArrayList<Integer> res) {
        if(root==null)
            return;
        postOrder(root.left,res);
        postOrder(root.right,res);
        res.add(root.data);
    }

}
