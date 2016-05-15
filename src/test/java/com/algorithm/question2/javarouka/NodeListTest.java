package com.algorithm.question2.javarouka;

import com.algorithm.question4.javarouka.NodeListSuitUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 * createdAt 2016. 5. 5.
 * @since 1.0
 * @author javarouka
 */
public class NodeListTest {

	@Test
	public void testIterator() {

		NodeList<Integer> nodeList = NodeListSuitUtils.makeNodeList2();

		int size = nodeList.size();
		int loopCount = 0;

		for(Node<Integer> node : nodeList) {
			loopCount++;
		}

		assertTrue(size == loopCount);
	}

	@Test
	public void remove() {

		NodeList<Integer> nodeList = NodeListSuitUtils.makeNodeList2();

		int size = nodeList.size();
		int mid = size % 2 == 0 ? size / 2 : Double.valueOf(Math.floor(size/2)).intValue();

		Node<Integer> midNode = nodeList.getNode(mid);

		nodeList.remove(mid);

		for(Node<Integer> node : nodeList) {
			assertTrue(!midNode.equals(node));
		}
	}
}