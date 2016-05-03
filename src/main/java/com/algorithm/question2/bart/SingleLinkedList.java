package com.algorithm.question2.bart;

public class SingleLinkedList<T> {

	private int size;
	private Node<T> header;

	public SingleLinkedList(T... args) {
		for(T each : args) {
			add(each);
		}
	}

	public T get(int index) {
		if(size <= index) {
			throw new ArrayIndexOutOfBoundsException();
		}

		Node node = header;
		for(int i = 0; i < index; i++) {
			node = next(node);
		}

		return (T) node.getValue();
	}

	public void add(T value) {
		Node last = getNode(size-1);
		size++;

		Node node = new Node();
		node.setValue(value);

		if(last == null) {
			header = node;
			return;
		}

		last.setNext(node);
	}

	public void remove(int index) {
		Node pre = getNode(index-1);
		Node post = getNode(index+1);
		pre.setNext(post);
		size--;
	}

	public int size() {
		return size;
	}

	private Node getNode(int index) {
		if(header == null) {
			return null;
		}

		Node node = header;
		for(int i = 0; i < index; i++) {
			node = next(node);
		}

		return node;
	}

	private Node next(Node pre) {
		return pre.getNext();
	}

}
