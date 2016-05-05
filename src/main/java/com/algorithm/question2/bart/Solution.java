package com.algorithm.question2.bart;

public class Solution {
	public static void main(String[] args) {
		SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList(1,2,3,4,5);
		int median = findMedian(singleLinkedList.size());
		System.out.println(singleLinkedList.get(median));

		singleLinkedList.remove(median);
		for(int i=0; i < singleLinkedList.size(); i++) {
			System.out.print(singleLinkedList.get(i));
		}
	}

	private static int findMedian(int size) {
		return size % 2 == 0 ? size/2 : (int) Math.floor(size/2);
	}
}
