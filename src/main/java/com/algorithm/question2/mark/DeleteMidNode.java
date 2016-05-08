package com.algorithm.question2.mark;

public class DeleteMidNode {
		
	public boolean isNodeInLinkedList(Node head, int data) {
		if(head == null) {
			return false;
		}
		
		if(head.data == data) {
			return true;
		}
		
		while(head.next != null) {
			head = head.next;
			if(head.data == data) {
				return true;
			}
		}
		
		return false;
	}

	public Node deleteMidNode(Node head) {
		if(head == null) {
			return null;
		}
		
		Node first = head;
		Node second = head;
		Node beforeFirstNode = null;
		
		while(second.next != null && second.next.next != null) {
			beforeFirstNode = first;
			first = first.next;
			second = second.next.next;
		}
		
		// tree 의 head가 제거대상 경우
		if(first == head) {
			return null;
		}
		
		beforeFirstNode.next = first.next;
		
		return head;
	}
}
