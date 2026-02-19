package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.Stack;

public class PostOrderTraversalIterative {
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
        postOrderIterative(root);
    }

    private static void postOrderIterative(BSTNode root) {
        Stack<BSTNode> firstStack = new Stack<>();
        Stack<BSTNode> secondStack = new Stack<>();

        firstStack.push(root);
        while (!firstStack.isEmpty()) {
            BSTNode itemPopped = firstStack.pop();
            secondStack.push(itemPopped);
            if (itemPopped.left != null) firstStack.push(itemPopped.left);
            if (itemPopped.right != null) firstStack.push(itemPopped.right);
        }
        while (!secondStack.isEmpty()) {
            System.out.print(secondStack.pop().data + " ");

        }
    }
}
