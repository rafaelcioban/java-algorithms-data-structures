package com.rcioban.datastructures.list.linkedlist;

/**
 * A LinkedList node representation
 *
 * @author rcioban
 */
public class Node {

    private Node next;
    private Node previous;
    private Object element;

    public Node(Object element) {
        this.element = element;
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getElement() {
        return element;
    }
}
