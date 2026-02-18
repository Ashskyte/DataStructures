package com.dsa.trees.binarysearchtree.treetraversal;

import com.dsa.trees.binarysearchtree.BSTNode;

import java.util.Stack;

public class PreOrderTraversalIterative {
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
        preOrderIterative(root);
    }

    private static void preOrderIterative(BSTNode root) {
        Stack<BSTNode> stack=new Stack<>();
        if(root==null)
            return;
        stack.push(root);
        while(!stack.isEmpty()){
    BSTNode node=stack.pop();
            System.out.print(node.data +" ");
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
                stack.push(node.left);
        }
    }
}
