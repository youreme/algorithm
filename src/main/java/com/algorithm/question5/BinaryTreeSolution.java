package com.algorithm.question5;

import com.google.common.collect.Lists;

import java.util.List;

public class BinaryTreeSolution {

	public static void main(String[] args) {
		Node root = new Node(1);
		Node root_left = new Node(2);
		Node root_right = new Node(3);
		Node root_left_left = new Node(4);
		Node root_left_right = new Node(5);
		Node root_right_left = new Node(6);
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

		Node commonParent = findCommonParent(root_left_left, root_right_left);
		System.out.println(commonParent.getValue());

		commonParent = findCommonParent(root_left_left, root_left_right);
		System.out.println(commonParent.getValue());
	}

	public static Node findCommonParent(Node node1, Node node2) {
		if(node1.getParent() == null) return node1;
		if(node2.getParent() == null) return node2;

		List<Node> node1ParentList = getParentList(node1);
		List<Node> node2ParentList = getParentList(node2);
		int node1Level = node1ParentList.size();
		int node2Level = node2ParentList.size();

		if(node1Level == node2Level) {
			for(int i = 0; i < node1Level; i++) {
				if(node1ParentList.get(i) == node2ParentList.get(i)) {
					return node1ParentList.get(i);
				}
			}
		}

		if(node1Level > node2Level) {
			int diff = node1Level - node1Level;
			for(int i = 0; i < node2Level; i++) {
				if(node1ParentList.get(i+diff) == node2ParentList.get(i)) {
					return node2ParentList.get(i);
				}
			}
		}else {
			int diff = node2Level - node1Level;
			for(int i = 0; i < node1Level; i++) {
				if(node1ParentList.get(i) == node2ParentList.get(i+diff)) {
					return node1ParentList.get(i);
				}
			}
		}

		return null;
	}

	private static List<Node> getParentList(Node node) {
		List<Node> parentList = Lists.newArrayList();
		Node pointcut = node;
		while (pointcut.getParent() != null) {
			parentList.add(pointcut.getParent());
			pointcut = pointcut.getParent();
		}

		return parentList;
	}
}
