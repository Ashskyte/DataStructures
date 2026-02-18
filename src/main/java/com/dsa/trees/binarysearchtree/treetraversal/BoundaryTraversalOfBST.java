package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

public class BoundaryTraversalOfBST {
    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.right = new BSTNode(15);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(7);
        root.right.left = new BSTNode(12);
        root.right.right = new BSTNode(18);

        boundaryTraversal(root);
    }

    private static void boundaryTraversal(BSTNode root) {


    }
}
