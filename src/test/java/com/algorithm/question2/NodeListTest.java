package com.algorithm.question2;

import com.algorithm.question2.javarouka.Node;
import com.algorithm.question2.javarouka.NodeList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 * createdAt 2016. 5. 5.
 * @since 1.0
 * @author javarouka
 */
public class NodeListTest {


	public NodeList<Integer> makeNodeList() {
		NodeList<Integer> nodeList = new NodeList<Integer>();
		nodeList.add(new Node<Integer>(1));
		nodeList.add(new Node<Integer>(2));
		nodeList.add(new Node<Integer>(3));
		nodeList.add(new Node<Integer>(4));
		nodeList.add(new Node<Integer>(5));
		return nodeList;
	}

	@Test
	public void testIterator() {

		NodeList<Integer> nodeList = makeNodeList();

		int size = nodeList.size();
		int loopCount = 0;

		for(Node<Integer> node : nodeList) {
			loopCount++;
		}

		assertTrue(size == loopCount);
	}

	@Test
	public void remove() {

		NodeList<Integer> nodeList = makeNodeList();

		int size = nodeList.size();
		int mid = size % 2 == 0 ? size / 2 : Double.valueOf(Math.floor(size/2)).intValue();

		Node<Integer> midNode = nodeList.getNode(mid);

		nodeList.remove(mid);

		for(Node<Integer> node : nodeList) {
			assertTrue(!midNode.equals(node));
		}
	}
}