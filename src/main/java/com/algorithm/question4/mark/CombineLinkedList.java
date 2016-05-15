package com.algorithm.question4.mark;

import com.algorithm.question2.mark.Node;

public class CombineLinkedList {

	public Node combine(Node node1, Node node2) {
		if(node1 == null && node2 == null) {
			return null;
		}
		
		if(node1 == null) {
			return node2;
		}
		
		if(node2 == null) {
			return node1;
		}
		
		Node head = combine(node1.next, node2.next);
		node2.next = head;
		node1.next = node2;
		
		return node1;
	}

	public int getLength(Node result) {
		if(result == null) {
			return 0;
		}
		
		int size = 0;
		while(result != null) {
			size++;
			result = result.next;
		}
		
		return size;
	}

	public int sumNodeValue(Node result) {
		if(result == null) {
			return 0;
		}
		
		int sum = 0;
		while(result != null) {
			sum += result.data;
			result = result.next;
		}
		
		return sum;
	}

}
