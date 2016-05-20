package com.algorithm.question5;

public class FindSameAncestor {
	public Node buildBinaryTree(int... datas) {
		if(datas.length < 7) {
			return null;
		}
		
		Node head = new Node(datas[0]);
		head.left = new Node(datas[1]);
		head.right = new Node(datas[2]);
		head.left.left = new Node(datas[3]);
		head.left.right = new Node(datas[4]);
		head.right.left = new Node(datas[5]);
		head.right.right = new Node(datas[6]);
		
		return head;
	}
	
	public Node findSameAncestorInBinaryTree(Node head, Node node1, Node node2) {
		if(head == null) {
			return null;
		}
		
		boolean left = isNodeInTree(head.left, node1, node2);
		boolean right = isNodeInTree(head.right, node1, node2);
		
		if(left && right) {
			return head;
		} else if(left && !right) {
			return findSameAncestorInBinaryTree(head.left, node1, node2);
		} else if(!left && right) {
			return findSameAncestorInBinaryTree(head.right, node1, node2);
		}
		
		return null;
	}

	private boolean isNodeInTree(Node head, Node node1, Node node2) {
		if(head == null) {
			return false;
		}
		
		if(head.data == node1.data || head.data == node2.data) {
			return true;
		}
		
		return isNodeInTree(head.left, node1, node2) || isNodeInTree(head.right, node1, node2);
	}

	public Node findSameAncestorInSearchTree(Node head, Node node1, Node node2) {
		if(head == null) {
			return null;
		}
		
		int high = node1.data > node2.data ? node1.data : node2.data;
		int low = node1.data == high ? node2.data : node1.data; 
		
		if(head.data > low && head.data < high) {
			return head;
		} else if(head.data >= high){
			return findSameAncestorInSearchTree(head.left, node1, node2);
		} else if(head.data <= low) {
			return findSameAncestorInSearchTree(head.right, node1, node2);
		}
		
		return null;
	}
}
