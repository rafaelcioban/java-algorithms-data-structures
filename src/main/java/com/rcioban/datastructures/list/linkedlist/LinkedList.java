package com.rcioban.datastructures.list.linkedlist;

import com.rcioban.datastructures.list.List;

/**
 * Basic implementation of a LinkedList
 *
 * @author rcioban
 */
public class LinkedList<E> implements List<E> {

    private Node first;
    private Node last;
    private int totalOfElements;

    public void addFirst(E element) {
        if(this.totalOfElements == 0) {
            Node newNode = new Node(element);
            this.first = newNode;
            this.last = newNode;
        } else {
            Node newNode = new Node(element, this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
        }
        totalOfElements++;
    }

    public void add(E element) {
        if(this.totalOfElements == 0) {
            this.addFirst(element);
        } else {
            Node newNode = new Node(element);
            newNode.setPrevious(this.last);
            this.last.setNext(newNode);
            this.last = newNode;
            totalOfElements++;
        }
    }

    public void add(int index, E element) {
        if(index == 0) {
            this.addFirst(element);
        } else if (index == totalOfElements) {
            this.add(element);
        } else {
            Node previous = getNodeByIndex(index - 1);
            Node next = previous.getNext();
            Node newNode = new Node(element, next);
            newNode.setPrevious(previous);
            previous.setNext(newNode);
            next.setPrevious(newNode);
            this.totalOfElements++;
        }
    }

    public E get(int index) {
        if(index == 0){
            return (E) this.first.getElement();
        } else if (index == totalOfElements) {
            return (E) this.last.getElement();
        }
        return (E) getNodeByIndex(index).getElement();
    }

    public void removeFirst(){
        if(this.totalOfElements == 0) {
            throw new RuntimeException("List is empty");
        }
        this.first = this.first.getNext();
        this.totalOfElements--;
        if(this.totalOfElements == 0) {
            this.last = null;
        }
    }

    public void removeLast(){
        if(this.totalOfElements == 1){
            this.removeFirst();
        } else {
            Node beforeLast = this.last.getPrevious();
            beforeLast.setNext(null);
            this.last = beforeLast;
            this.totalOfElements--;
        }
    }

    public void remove(int index) {
        if(!isPositionBusy(index)) {
            throw new IllegalArgumentException("Invalid index");
        } else if(index == 0) {
            removeFirst();
        } else if(index == totalOfElements) {
            removeLast();
        } else {
            Node previous = getNodeByIndex(index - 1);
            Node current = previous.getNext();
            Node next = current.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            this.totalOfElements--;
        }
    }

    public boolean contains(E element) {
        Node current = first;
        while (current != null) {
            if(element.equals(current.getElement())){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int getSize() {
        return this.totalOfElements;
    }

    public String toString() {
        if (this.totalOfElements == 0) {
            return "[]";
        }
        Node current = first;

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < totalOfElements; i++) {
            sb.append(current.getElement()).append(",");
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    private Node getNodeByIndex(int index) {
        if(!isPositionBusy(index)) {
            throw new IllegalArgumentException("Invalid index");
        }
        Node current = first;
        for(int i=0; i<index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private boolean isPositionBusy(int index) {
        return index >= 0 && index < this.totalOfElements;
    }
}
