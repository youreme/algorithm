package com.algorithm.question3.samdasoo;

/**
 * Created by xungwoo on 2016-05-06.
 */
public class VeryGoodList<E> {

    Node<E> first;
    Node<E> last;
    int size = 0;

    public VeryGoodList() {
    }

    Node<E> node(int index) {
        Node<E> current = first;
        for(int i=0; i<index; i++) {
            current = current.next;
        }
        return current;
    }

    public E get(int index) {
        return node(index).item;
    }

    public E getNoSizeFromLast(int indexFromLast) {
        Node<E> current = first;
        Node<E> k = node(indexFromLast - 1);
        while (current.next != null && k.next != null) {
            current = current.next;
            k = k.next;
        }
        return current.item;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    void add(E e) {
        final Node<E> currentLast = last;
        final Node<E> newNode = new Node<>(e, null);
        last = newNode;
        if (currentLast == null) {
            first = newNode;
        } else {
            currentLast.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }


}
