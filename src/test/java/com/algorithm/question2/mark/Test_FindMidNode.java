package com.algorithm.question2.mark;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Test_FindMidNode {
	private FindMidNode findMidNode = new FindMidNode(); 
	
	@Test
	public void TestFindMidNode_input_node_null() {
		// setup
		Node head = null;
		
		// execute
		Node result = this.findMidNode.findMidNode(head);
		
		// verify
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void TestFindMidNode_input_node_size_1() {
		// setup
		Node head = new Node(2);
		
		// execute
		Node result = this.findMidNode.findMidNode(head);
		
		// verify
		Assert.assertThat(result.data, is(2));
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
		Node result = this.findMidNode.findMidNode(head);
		
		// verify
		Assert.assertThat(result.data, is(3));
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
		Node result = this.findMidNode.findMidNode(head);
		
		// verify
		Assert.assertThat(result.data, is(3));
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
		Node result = this.findMidNode.findMidNode(head);
		
		// verify
		Assert.assertThat(result.data, is(3));
	}
	
}
