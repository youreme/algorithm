package com.algorithm.question4.hunky;

/**
 * Created by youreme on 2016. 5. 15..
 */
public class Solution {
    public static void main(String... args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Node m1 = new Node(5);
        Node m2 = new Node(6);
        Node m3 = new Node(7);
        Node m4 = new Node(8);
        Node m5 = new Node(9);
        Node m6 = new Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = m6;

        Node head = mergeNode(n1, m1);
        while (head != null) {
            System.out.print(head.data + " => ");
            head = head.next;
        }

    }

    private static Node mergeNode(Node n1, Node m1) {
        Node newHead = new Node(-1);
        Node curr = newHead;

        boolean flag = true;
        while (n1 != null && m1 != null) {
            if (flag) {
                curr.next = new Node(n1.data);
                n1 = n1.next;
            } else {
                curr.next = new Node(m1.data);
                m1 = m1.next;
            }

            flag = !flag;
            curr = curr.next;
        }

        while (n1 != null) {
            curr.next = new Node(n1.data);
            curr = curr.next;
            n1 = n1.next;
        }

        while (m1 != null) {
            curr.next = new Node(m1.data);
            curr = curr.next;
            m1 = m1.next;
        }

        return newHead.next;
    }
}
