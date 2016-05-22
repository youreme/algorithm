package com.algorithm.question5;

public class BinarySearchTreeSolution {

	public static void main(String[] args) {
		Node root = new Node(4);
		Node root_left = new Node(2);
		Node root_right = new Node(6);
		Node root_left_left = new Node(1);
		Node root_left_right = new Node(3);
		Node root_right_left = new Node(5);
		Node root_right_right = new Node(7);

		root.setLeftChild(root_left);
		root.setRightChild(root_right);
		root_left.setParent(root);
		root_right.setParent(root);

		root_left.setLeftChild(root_left_left);
		root_left.setRightChild(root_left_right);
		root_left_left.setParent(root_left);
		root_left_right.setParent(root_left);

		root_right.setLeftChild(root_right_left);
		root_right.setRightChild(root_right_right);
		root_right_left.setParent(root_right);
		root_right_right.setParent(root_right);

		Node commonParent = findCommonParent(root ,root_left_left, root_right_left);
		System.out.println(commonParent.getValue());

		commonParent = findCommonParent(root,root_left_left, root_left_right);
		System.out.println(commonParent.getValue());

	}

	public static Node findCommonParent(Node root, Node node1, Node node2) {
		int rootValue = root.getValue();
		int node1Value = node1.getValue();
		int node2Value = node2.getValue();

		if(node1Value <= rootValue && node2Value >= rootValue) {
			return root;
		}

		if(node1Value >= rootValue && node2Value <= rootValue) {
			return root;
		}

		if(rootValue < node1Value && rootValue < node2Value) {
			return findCommonParent(root.getRightChild(), node1, node2);
		}

		if(rootValue > node1Value && rootValue > node2Value) {
			return findCommonParent(root.getLeftChild(), node1, node2);
		}

		return null;
	}

}
