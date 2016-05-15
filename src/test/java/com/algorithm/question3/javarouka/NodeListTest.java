package com.algorithm.question3.javarouka;

import com.algorithm.question4.javarouka.NodeListSuitUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * createdAt 2016. 5. 8.
 * @since 1.0
 * @author javarouka
 */
public class NodeListTest {

	@Test
	public void testGetNode() throws Exception {
		NodeList<Integer> nodeList = NodeListSuitUtils.makeNodeList3();

		Node<Integer> node = nodeList.getNode(4);
		System.out.println(node.getData());

		assertTrue(5 == node.getData());
	}
}