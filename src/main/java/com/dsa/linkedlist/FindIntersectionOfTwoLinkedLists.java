package com.dsa.linkedlist;

import static com.dsa.linkedlist.ReverseLinkedList.printList;

public class FindIntersectionOfTwoLinkedLists {
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
        Node intersection = findIntersection(head1, head2);

        // Print intersection element
        System.out.println("Intersection Element: " + intersection.data);
    }

    private static Node findIntersection(Node head, Node head2) {
       int  firstLength= findLength(head);
        int secondLength=findLength(head2);
        Node first=head;
        Node second=head2;

        int difference=firstLength-secondLength;
        System.out.println("difference is : "+difference);
        if(difference<0){
            difference=difference*-1;
            for(int i=0;i<difference;i++){
                second=second.next;
            }
        }
        else{
            for(int i=0;i<difference;i++){
                first=first.next;
            }
        }
        while(first.next!=second.next){
            first= first.next;
            second=second.next;
        }
        return second;
    }

    private static int findLength(Node head2) {
        Node temp=head2;
        int counter=0;
        while(temp.next!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }
}
