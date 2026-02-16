package com.dsa.linkedlist;

import static com.dsa.linkedlist.ReverseLinkedList.printList;

public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Find middle of the list
        Node middle = findMiddle(head);

        // Print middle element
        System.out.println("Middle Element: " + middle.data);
    }

    private static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
