package com.algorithm.question3.javarouka;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * createdAt 2016. 5. 8.
 * @since 1.0
 * @author javarouka
 */
public class NodeListTest {

	public NodeList<String> makeNodeList() {
		NodeList<String> nodeList = new NodeList<>();
		nodeList.add(new Node<>("1"));
		nodeList.add(new Node<>("2"));
		nodeList.add(new Node<>("3"));
		nodeList.add(new Node<>("4"));
		nodeList.add(new Node<>("5"));
		return nodeList;
	}

	@Test
	public void testGetNode() throws Exception {
		NodeList<String> nodeList = makeNodeList();

		Node<String> node = nodeList.getNode(4);

		assertTrue("4".equals(node.getData()));
	}
}