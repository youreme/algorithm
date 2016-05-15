package com.algorithm.question4.javarouka;

import com.algorithm.question3.javarouka.Node;

/**
 *
 * createdAt 2016. 5. 15.
 * @since 1.0
 * @author javarouka
 */
public class MergeableNode<T> implements Mergeable<MergeableNode<T>> {

	private T data;
	private MergeableNode<T> next;

	public MergeableNode(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public MergeableNode getNext() {
		return this.next;
	}

	public void setNext(MergeableNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

	@Override public MergeableNode<T> merge(MergeableNode<T> other) {
		if(other == null) {
			return null;
		}

		/*
		1->2->3->4
		5->6->7->8->9->10
		output> 1->5->2->6->3->7->4->8->9->10
		 */
		MergeableNode origNext = this.getNext();
		MergeableNode otherNext = other.getNext();
		other.setNext(origNext);
		this.setNext(other);
		origNext.setNext(otherNext);

		return this;
	}
}
