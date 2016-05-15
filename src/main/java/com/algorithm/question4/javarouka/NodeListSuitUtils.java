package com.algorithm.question4.javarouka;

import com.algorithm.question2.javarouka.Node;
import com.algorithm.question4.javarouka.MergeableNodeList;

import java.util.List;

/**
 *
 * createdAt 2016. 5. 15.
 * @since 1.0
 * @author javarouka
 */
public class NodeListSuitUtils {

	public static com.algorithm.question2.javarouka.NodeList<Integer> makeNodeList2() {
		com.algorithm.question2.javarouka.NodeList<Integer> nodeList = new com.algorithm.question2.javarouka.NodeList<>();
		nodeList.add(new Node<>(1));
		nodeList.add(new Node<>(2));
		nodeList.add(new Node<>(3));
		nodeList.add(new Node<>(4));
		nodeList.add(new Node<>(5));
		return nodeList;
	}

	public static com.algorithm.question3.javarouka.NodeList<Integer> makeNodeList3() {
		com.algorithm.question3.javarouka.NodeList<Integer> nodeList = new com.algorithm.question3.javarouka.NodeList<>();
		nodeList.add(new com.algorithm.question3.javarouka.Node<>(1));
		nodeList.add(new com.algorithm.question3.javarouka.Node<>(2));
		nodeList.add(new com.algorithm.question3.javarouka.Node<>(3));
		nodeList.add(new com.algorithm.question3.javarouka.Node<>(4));
		nodeList.add(new com.algorithm.question3.javarouka.Node<>(5));
		return nodeList;
	}

	public static MergeableNodeList<Integer> makeMergeableNodeList3(List<Integer> elements) {
		MergeableNodeList<Integer> nodeList = new MergeableNodeList<>();
		for(Integer i : elements) {
			nodeList.add(new MergeableNode<>(i));
		}
		return nodeList;
	}
}
