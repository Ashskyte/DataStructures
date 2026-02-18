package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.Stack;

public class InOrderTraversalIterative {
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
        inOrderIterative(root);
    }

    private static void inOrderIterative(BSTNode root) {
        //left-->root-->right
        Stack<BSTNode> stack = new Stack<>();
        BSTNode curr = root;
        if (root == null) return;
        while (!stack.isEmpty() || curr != null) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            BSTNode node = stack.pop();
            System.out.print(node.data + " ");
            curr = node.right;
        }
    }
}
