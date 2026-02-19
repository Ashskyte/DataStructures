package com.dsa.trees.binarysearchtree;

public class SumOfRightLeaveNodes {
    public static void main(String[] args) {
        BSTNode node=new BSTNode(1);
        node.left=new BSTNode(2);
        node.right=new BSTNode(3);
        node.left.left=new BSTNode(4);
        node.left.right=new BSTNode(5);
        node.right.right=new BSTNode(6);
        int sum=0;
        System.out.println(sumOfRightLeaveNodes(node,sum));
    }

    private static int sumOfRightLeaveNodes(BSTNode node,int sum) {


        if(node==null)
            return 0;

        if(node.right.left==null&& node.right.right==null && node.right!=null){
            sum+=node.right.data;
        }
        sumOfRightLeaveNodes(node.left,sum);
        sumOfRightLeaveNodes(node.right,sum);
        return sum;
    }
}
