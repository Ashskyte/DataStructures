package com.dsa.linkedlist;

import static com.dsa.linkedlist.ReverseLinkedList.printList;

public class GetNthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);
        int k = 2;

        // Find middle of the list
        Node node = findNthNodeFromEnd(head, 2);

       Node delete= deleteNthNodeFromEnd(head,node);

        // Print middle element
        System.out.println("Kth Element: " + node.data);
        System.out.println("after deleteting Element: ");
        printList(head);
    }

    private static Node deleteNthNodeFromEnd(Node head,Node tobeDeleted) {

        Node temp=head;

        while(temp.next!=null){

            if(temp.next==tobeDeleted){
                tobeDeleted.data=tobeDeleted.next.data;
                temp.next=temp.next.next;
                return temp;
            }
            temp=temp.next;
        }

        return new Node(-1);
    }

    private static Node findNthNodeFromEnd(Node head, int k) {
        int length = findLengthOfLinkedList(head);
        if (k > length) {
            return new Node(-1);
        }
        int counter = 0;
        Node current = head;
        while (counter != length - k) {
            current = current.next;
            counter++;
        }

        System.out.println("length is :" + length);
        return current;
    }

    private static int findLengthOfLinkedList(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }
}
