package com.algorithm.question2.hunky;

/**
 * Created by youreme on 2016. 5. 3..
 */
public class Solution {
    public static void main(String... args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        Node midNode = findMidNode(n1);
        System.out.println("Output : " + midNode.data);

        Node head = removeMidNode(n1);
        System.out.print("Output : " + head.data);
        while (head.next != null) {
            System.out.print("->");
            head = head.next;
            System.out.print(head.data);

        }
    }

    private static Node findMidNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static Node removeMidNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        Node prev = head;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }
}
