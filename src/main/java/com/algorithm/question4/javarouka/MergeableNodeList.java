package com.algorithm.question4.javarouka;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * createdAt 2016. 5. 15.
 * @since 1.0
 * @author javarouka
 */
@SuppressWarnings("unchecked")
public class MergeableNodeList<T> implements Iterable<MergeableNode<T>>, Mergeable<MergeableNodeList<T>> {

	private MergeableNode<T> firstNode;
	private MergeableNode<T> lastNode;
	private int size;

	public void add(MergeableNode<T> node) {
		this.size++;
		if(this.firstNode == null) {
			this.firstNode = node;
			this.lastNode = node;
			return;
		}
		this.lastNode.setNext(node);
		this.lastNode = node;
	}

	public MergeableNode<T> getNode(int index) {

		if(index >= size) {
			throw new IndexOutOfBoundsException();
		}

		int current = 0;
		for(MergeableNode<T> node : this) {
			if(current == index) {
				return node;
			}
			current++;
		}
		throw new NoSuchElementException();
	}

	public MergeableNode<T> remove(int index) {
		int current = 0;
		MergeableNode<T> prevNode = null;
		MergeableNode<T> targetNode = null;
		for(MergeableNode<T> node : this) {
			if(current == index) {
				targetNode = node;
				break;
			}
			prevNode = node;
			current++;
		}

		if(targetNode == null) {
			return null;
		}

		prevNode.setNext(targetNode.getNext());

		size--;
		return targetNode;
	}

	public int size() {
		return this.size;
	}

	@Override
	public Iterator<MergeableNode<T>> iterator() {
		return new NodeIterator();
	}

	private class NodeIterator implements Iterator<MergeableNode<T>>  {

		private MergeableNode<T> currentNode;

		@Override
		public boolean hasNext() {
			return currentNode == null ? firstNode.getNext() != null : currentNode.getNext() != null;
		}

		@Override
		public MergeableNode<T> next() {
			if(currentNode == null) {
				currentNode = firstNode;
				return firstNode;
			}
			MergeableNode nextNode = this.hasNext() ? currentNode.getNext() : null;
			currentNode = nextNode;
			return nextNode;
		}

		@Override
		public void remove() {
			if(currentNode == null) {
				return;
			}

			MergeableNode<T> nextNode = currentNode.getNext();
			currentNode = null;
			if(nextNode != null) {
				currentNode = nextNode;
				size--;
			}
		}
	}

	private MergeableNode<T> merge(MergeableNode<T> o1, MergeableNode<T> o2) {

		if(o1 == null && o2 == null) {
			return null;
		}

		if(o1 == null) {
			return o2;
		}

		if(o2 == null) {
			return o1;
		}

		MergeableNode merged = merge(o1.getNext(), o2.getNext());

		o2.setNext(merged);
		o1.setNext(o2);

		return o1;
	}

	@Override
	public MergeableNodeList<T> merge(MergeableNodeList<T> other) {
		MergeableNode<T> node = this.getNode(0);
		MergeableNode<T> otherNode = other.getNode(0);
		merge(node, otherNode);

		this.size = this.size() + other.size();

		return this;
	}
}