package com.algorithm.question4.javarouka;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * createdAt 2016. 5. 15.
 * @since 1.0
 * @author javarouka
 */
public class MergeableNodeTest {

	@Test
	public void testMerge() {

		MergeableNodeList<Integer> nodeList1 = NodeListSuitUtils.makeMergeableNodeList3(Lists.newArrayList(1,2,3,4));
		MergeableNodeList<Integer> nodeList2 = NodeListSuitUtils.makeMergeableNodeList3(Lists.newArrayList(5,6,7,8,9,10));

		MergeableNodeList<Integer> mergedList = nodeList1.merge(nodeList2);

		assertTrue(mergedList.size() == 10);

		// 1,5,2,6,3,[7],4,8,9,10
		assertTrue(mergedList.getNode(5).getData().equals(7));

	}

}