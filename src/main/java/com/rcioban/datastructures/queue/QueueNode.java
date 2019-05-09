package com.rcioban.datastructures.queue;

/**
 * A Queue node representation
 *
 * @author rcioban
 */
public class QueueNode<E> {

    private E element;
    private QueueNode next;

    public QueueNode(E element, QueueNode<E> next) {
        this.element = element;
        this.next = next;
    }

    public QueueNode(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public QueueNode<E> getNext() {
        return next;
    }

    public void setNext(QueueNode<E> next) {
        this.next = next;
    }
}
