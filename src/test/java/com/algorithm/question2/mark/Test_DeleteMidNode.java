package com.algorithm.question2.mark;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

public class Test_DeleteMidNode {
	private DeleteMidNode deleteMidNode = new DeleteMidNode();
	
	@Test
	public void TestFindMidNode_input_node_null() {
		// setup
		Node head = null;
		
		// execute
		head = this.deleteMidNode.deleteMidNode(head);
		
		// verify
		Assert.assertEquals(head, null);
	}
	
	@Test
	public void TestFindMidNode_input_node_size_1() {
		// setup
		Node head = new Node(2);
		
		// execute
		head = this.deleteMidNode.deleteMidNode(head);
		
		// verify
		Assert.assertThat(this.deleteMidNode.isNodeInLinkedList(head, 2), is(false));
	}
	
	@Test
	public void TestFindMidNode_input_node_size_even() {
		// setup
		Node head = new Node(2);
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		Node node3 = new Node(5);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		// execute
		head = this.deleteMidNode.deleteMidNode(head);
		
		// verify
		Assert.assertThat(this.deleteMidNode.isNodeInLinkedList(head, 3), is(false));
	} 
	
	@Test
	public void TestFindMidNode_input_node_size_odd() {
		// setup
		Node head = new Node(2);
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		
		head.next = node1;
		node1.next = node2;
		
		// execute
		head = this.deleteMidNode.deleteMidNode(head);
		
		// verify
		Assert.assertThat(this.deleteMidNode.isNodeInLinkedList(head, 3), is(false));
	}
	
	@Test
	public void TestFindMidNode_example() {
		// setup
		Node head = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
	
		// execute
		head = this.deleteMidNode.deleteMidNode(head);
		
		// verify
		Assert.assertThat(this.deleteMidNode.isNodeInLinkedList(head, 3), is(false));
	}
}
