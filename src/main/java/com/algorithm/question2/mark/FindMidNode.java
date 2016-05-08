package com.algorithm.question2.mark;

public class FindMidNode {
	public Node findMidNode(Node head) {
		if(head == null) {
			return null;
		}
		
		Node first = head;
		Node second = head;
		
		while(second.next != null && second.next.next != null) {
			first = first.next;
			second = second.next.next;
		}
		
		return first;
	}
}
