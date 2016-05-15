package com.algorithm.question3.javarouka;

/**
 *
 * createdAt 2016. 5. 8.
 * @since 1.0
 * @author javarouka
 */
public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
