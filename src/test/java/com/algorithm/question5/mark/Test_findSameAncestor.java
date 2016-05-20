package com.algorithm.question5.mark;

import org.junit.Assert;
import org.junit.Test;

import com.algorithm.question5.FindSameAncestor;
import com.algorithm.question5.Node;

import static org.hamcrest.core.Is.is;

public class Test_findSameAncestor {
	private FindSameAncestor findSameAncestor = new FindSameAncestor();

	@Test
	public void findSameAncestorInBinaryTree_head_is_null() {
		// setup
		Node head = null;
		
		// execute
		Node result = findSameAncestor.findSameAncestorInBinaryTree(head, new Node(4), new Node(5));
		
		// verify
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void findSameAncestorInBinaryTree_only_head_is() {
		// setup
		Node head = new Node(1);
		
		// execute
		Node result = findSameAncestor.findSameAncestorInBinaryTree(head, new Node(4), new Node(5));
		
		// verify
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void findSameAncestorInBinaryTree_example() {
		// setup
		Node head = findSameAncestor.buildBinaryTree(1,2,3,4,5,6,7);
		
		// execute
		Node result1 = findSameAncestor.findSameAncestorInBinaryTree(head, new Node(4), new Node(5));
		Node result2 = findSameAncestor.findSameAncestorInBinaryTree(head, new Node(4), new Node(6));
		
		// verify
		Assert.assertThat(result1.data, is(2));
		Assert.assertThat(result2.data, is(1));
	}
	
	@Test
	public void findSameAncestorInSearchTree_head_is_null() {
		// setup
		Node head = null;
		
		// execute
		Node result1 = findSameAncestor.findSameAncestorInSearchTree(head, new Node(4), new Node(5));
		
		// verify
		Assert.assertEquals(null, result1);
	}
	
	@Test
	public void findSameAncestorInSearchTree_only_head_is() {
		// setup
		Node head = new Node(1);
		
		// execute
		Node result1 = findSameAncestor.findSameAncestorInSearchTree(head, new Node(4), new Node(5));
		
		// verify
		Assert.assertEquals(null, result1);
	}

	@Test
	public void findSameAncestorInSearchTree_example() {
		// setup
		Node head = findSameAncestor.buildBinaryTree(4,2,6,1,3,5,7);
		
		// execute
		Node result1 = findSameAncestor.findSameAncestorInSearchTree(head, new Node(1), new Node(3));
		Node result2 = findSameAncestor.findSameAncestorInSearchTree(head, new Node(1), new Node(7));
		
		// verify
		Assert.assertThat(result1.data, is(2));
		Assert.assertThat(result2.data, is(4));
	}
	
}
