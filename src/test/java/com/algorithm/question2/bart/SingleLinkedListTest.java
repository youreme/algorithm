package com.algorithm.question2.bart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleLinkedListTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_ArrayIndexOutOfBountException() throws Exception {
		SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList(1,2,3,4);
		singleLinkedList.get(5);
	}

	@Test
	public void testGet() throws Exception {
		SingleLinkedList<String> singleLinkedList = new SingleLinkedList("A","B","S","X");
		assertEquals(singleLinkedList.get(0), "A");
		assertEquals(singleLinkedList.get(1), "B");
		assertEquals(singleLinkedList.get(2), "S");
		assertEquals(singleLinkedList.get(3), "X");
	}

	@Test
	public void testAdd() throws Exception {
		SingleLinkedList<String> singleLinkedList = new SingleLinkedList("A","B","S");
		singleLinkedList.add("X");

		assertEquals(singleLinkedList.size(), 4);
		assertEquals(singleLinkedList.get(3), "X");
	}

	@Test
	public void testRemove() throws Exception {
		SingleLinkedList<String> singleLinkedList = new SingleLinkedList("A","B","S","X");
		assertEquals(singleLinkedList.size(), 4);
		assertEquals(singleLinkedList.get(0), "A");
		assertEquals(singleLinkedList.get(1), "B");
		assertEquals(singleLinkedList.get(2), "S");
		assertEquals(singleLinkedList.get(3), "X");

		singleLinkedList.remove(2);

		assertEquals(singleLinkedList.size(), 3);
		assertEquals(singleLinkedList.get(0), "A");
		assertEquals(singleLinkedList.get(1), "B");
		assertEquals(singleLinkedList.get(2), "X");
	}

	@Test
	public void testSize() throws Exception {
		SingleLinkedList<String> singleLinkedList = new SingleLinkedList("A","B","S","X");
		assertEquals(singleLinkedList.size(), 4);
	}
}