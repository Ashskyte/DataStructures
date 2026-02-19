package com.dsa.linkedlist;

import static com.dsa.linkedlist.ReverseLinkedList.printList;

public class DeleteNodeFromLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Delete node at position 3
        Node newnode = deleteNode(head, 1);
        Node newNodeBetterWay = deleteNodeBetterWay(head, 3);

        // Print modified list
        System.out.println("Modified List:");
        printList(newNodeBetterWay);
    }

    private static Node deleteNodeBetterWay(Node head, int i) {
        int counter = 1;
        //in this if we have not given the head of linkedlist only given that which node to be deleted
        //in this case we can do is once we reach the node to be deleted , we can copy its immediate next node data to it and then assign the next pointer to next.next


        Node current = head;
        while (current != null) {
            if (counter == i && current.next != null) {
                current.data = current.next.data;
                current.next = current.next.next;
                return head;
            }
            current = current.next;
            counter++;
        }
        return head;
    }

    private static Node deleteNode(Node head, int i) {
        int counter = 1;
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (i == 1) {
                current = current.next;
                return current;
            }
            if (counter == i) {
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
            counter++;
        }
        return head;
    }
}
