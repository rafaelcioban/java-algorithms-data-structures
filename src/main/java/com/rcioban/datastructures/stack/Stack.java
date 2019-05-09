package com.rcioban.datastructures.stack;

/**
 * Basic implementation of a Stack
 *
 * @author rcioban
 */
public class Stack<E> {

    private StackNode<E> top;
    private int totalOfElements;

    public E pop() {
        E element = this.peek();
        this.top = this.top.getNext();
        this.totalOfElements--;
        return element;
    }

    public void push(E element) {
        StackNode<E> newNode = new StackNode(element, this.top);
        this.top = newNode;
        this.totalOfElements++;
    }

    public E peek() {
        if(top == null){
            throw new UnsupportedOperationException();
        }
        return this.top.getElement();
    }

    public int getSize() {
        return this.totalOfElements;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

}
