package com.algorithm.question3.mark;

import org.junit.Assert;
import org.junit.Test;

import com.algorithm.question2.mark.Node;

import static org.hamcrest.core.Is.is;

public class Test_FindNodeFromBackward {
	private FindNodeFromBackward findNodeFromBackward = new FindNodeFromBackward();
	
	@Test
	public void findNodeFromBackward_head_is_null() {
		// setup
		Node head = null;
		
		// execute
		Node result = this.findNodeFromBackward.findNodeFromBackward(head, 3);
		
		// verify
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void findNodeFromBackward_length_is_short_than_number() {
		// setup
		Node head = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(7);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;	
		
		// execute
		Node result = this.findNodeFromBackward.findNodeFromBackward(head, 10);
		
		// verify
		Assert.assertEquals(result, null);
	}
	
	@Test
	public void findNodeFromBackward_node_length_is_1() {
		// setup
		Node head = new Node(1);
		
		// execute
		Node result = this.findNodeFromBackward.findNodeFromBackward(head, 1);
		
		// verify
		Assert.assertThat(result.data, is(1));
	}
	
	@Test
	public void findNodeFromBackward_example() {
		// setup
		Node head = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(7);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;	
		
		// execute
		Node result = this.findNodeFromBackward.findNodeFromBackward(head, 2);
		
		// verify
		Assert.assertThat(result.data, is(6));
	}
	
	
}
