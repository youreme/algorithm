package com.algorithm.question2.hunky.javarouka;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * createdAt 2016. 5. 5.
 * @since 1.0
 * @author javarouka
 */
public class NodeList<T> implements Iterable<Node<T>> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	public void add(Node<T> node) {
		this.size++;
		if(this.firstNode == null) {
			this.firstNode = node;
			this.lastNode = node;
			return;
		}
		this.lastNode.setNext(node);
		this.lastNode = node;
	}

	public Node<T> getNode(int index) {

		if(index >= size) {
			throw new IndexOutOfBoundsException();
		}

		int current = 0;
		for(Node<T> node : this) {
			if(current == index) {
				return node;
			}
			current++;
		}
		throw new NoSuchElementException();
	}

	public Node<T> remove(int index) {
		int current = 0;
		Node<T> prevNode = null;
		Node<T> targetNode = null;
		for(Node<T> node : this) {
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
	public Iterator<Node<T>> iterator() {
		return new NodeIterator();
	}

	private class NodeIterator implements Iterator<Node<T>>  {

		private Node<T> currentNode;

		@Override
		public boolean hasNext() {
			return currentNode == null ? firstNode.getNext() != null : currentNode.getNext() != null;
		}

		@Override
		public Node<T> next() {
			if(currentNode == null) {
				currentNode = firstNode;
				return firstNode;
			}
			Node nextNode = this.hasNext() ? currentNode.getNext() : null;
			currentNode = nextNode;
			return nextNode;
		}

		@Override
		public void remove() {
			if(currentNode == null) {
				return;
			}

			Node<T> nextNode = currentNode.getNext();
			currentNode = null;
			if(nextNode != null) {
				currentNode = nextNode;
				size--;
			}
		}
	}
}
