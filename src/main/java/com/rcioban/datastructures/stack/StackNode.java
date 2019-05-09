package com.rcioban.datastructures.stack;

/**
 * A Stack node representation
 *
 * @author rcioban
 */
public class StackNode<E> {

    private StackNode<E> next;
    private E element;

    public StackNode(E element) {
        this.element = element;
    }

    public StackNode(E element, StackNode next) {
        this.next = next;
        this.element = element;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public E getElement() {
        return element;
    }
}
