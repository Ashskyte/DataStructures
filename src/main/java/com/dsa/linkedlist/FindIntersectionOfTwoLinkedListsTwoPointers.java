package com.dsa.linkedlist;

public class FindIntersectionOfTwoLinkedListsTwoPointers {
    public static void main(String[] args) {
        // creation of first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // 15 is the intersection point
        head2.next.next.next = head1.next;

        // Print original list
        System.out.println("Original List:");
        // printList(head);

        // Find intersection of the list
        Node intersection = findIntersectionTwoPointers(head1, head2);

        // Print intersection element
        System.out.println("Intersection Element: " + intersection.data);
    }

    private static Node findIntersectionTwoPointers(Node head1, Node head2) {
        Node first=head1;
        Node second=head2;
        while(first!=second){
            first=first.next;
            second=second.next;
            if(first==second){
                return first;
            }
            if(first==null){
                first=head2;
            }
            if(second==null){
                second=head1;
            }
        }
        return first;
    }
}
