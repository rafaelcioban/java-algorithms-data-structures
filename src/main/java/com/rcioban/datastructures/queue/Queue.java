package com.rcioban.datastructures.queue;

/**
 * Basic implementation of a Queue
 *
 * @author rcioban
 */
public class Queue<E> {

    private QueueNode<E> first;
    private QueueNode<E> last;
    private int totalOfElements;

    public void add(E element) {
        QueueNode<E> newNode = new QueueNode(element);
        if(last != null) {
            last.setNext(newNode);
        }
        this.last = newNode;
        if(first == null) {
            first = last;
        }
        this.totalOfElements++;
    }

    public E remove() {
        if(first == null) {
            throw new UnsupportedOperationException();
        }
        E element = first.getElement();
        this.first = first.getNext();
        if(first == null) {
            last = null;
        }
        this.totalOfElements--;
        return element;
    }

    public E peek() {
        if(first == null) {
            throw new UnsupportedOperationException();
        }
        return this.first.getElement();
    }

    public int getSize() {
        return this.totalOfElements;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
