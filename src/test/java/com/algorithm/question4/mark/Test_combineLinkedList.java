package com.algorithm.question4.mark;

import org.junit.Assert;
import org.junit.Test;

import com.algorithm.question2.mark.Node;

import static org.hamcrest.core.Is.is;

public class Test_combineLinkedList {
	public CombineLinkedList combineLinkedList = new CombineLinkedList();
	
	@Test
	public void test_head_is_null() {
		// setup
		Node head1 = null;
		Node head2 = null;
		
		// execute
		Node result = this.combineLinkedList.combine(head1, head2);
		
		// verify
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void test_same_linkedList_combine() {
		// setup
		Node head1 = new Node(1);
		Node head2 = new Node(1);
		
		Node node1 = new Node(2);
		Node node2 = new Node(2);
		
		Node node3 = new Node(3);
		Node node4 = new Node(3);
		
		Node node5 = new Node(4);
		Node node6 = new Node(4);
		
		Node node7 = new Node(5);
		Node node8 = new Node(5);
		
		
		head1.next = node1;
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		head2.next = node2;		
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		
		// execute
		Node result = this.combineLinkedList.combine(head1, head2);
		
		// verify
		Assert.assertThat(combineLinkedList.getLength(result), is(10));
		Assert.assertThat(combineLinkedList.sumNodeValue(result), is(30));
	}
	
	@Test
	public void test_example() {
		// setup
		Node head1 = new Node(1);
		Node head2 = new Node(2);
		
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		
		Node node3 = new Node(5);
		Node node4 = new Node(6);
		
		Node node5 = new Node(7);
		Node node6 = new Node(8);
		
		Node node7 = new Node(9);
		Node node8 = new Node(10);
		
		head1.next = node1;
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		head2.next = node2;		
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		
		// execute
		Node result = this.combineLinkedList.combine(head1, head2);
		
		// verify
		Assert.assertThat(combineLinkedList.getLength(result), is(10));
		Assert.assertThat(combineLinkedList.sumNodeValue(result), is(55));
	}
	
	@Test
	public void test_linkedList_length_is_diffrent() {
		// setup
				Node head1 = new Node(1);
				Node head2 = new Node(2);
				
				Node node1 = new Node(3);
				Node node2 = new Node(4);
				
				Node node3 = new Node(5);
				Node node4 = new Node(6);
				
				Node node5 = new Node(7);
				
				Node node7 = new Node(9);
				
				head1.next = node1;
				node1.next = node3;
				node3.next = node5;
				node5.next = node7;
				
				head2.next = node2;		
				node2.next = node4;
				
				// execute
				Node result = this.combineLinkedList.combine(head1, head2);
				
				// verify
				Assert.assertThat(combineLinkedList.getLength(result), is(8));
				Assert.assertThat(combineLinkedList.sumNodeValue(result), is(37));
	}
}
