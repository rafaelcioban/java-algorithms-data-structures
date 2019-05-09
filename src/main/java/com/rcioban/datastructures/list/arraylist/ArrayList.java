package com.rcioban.datastructures.list.arraylist;

import com.rcioban.datastructures.list.List;

import java.util.Arrays;

/**
 * Basic implementation of an ArrayList
 *
 * @author rcioban
 */
public class ArrayList<E> implements List<E> {

    private Object[] elements = new Object[100];
    private int totalOfElements;

    public void add(E element) {
        ensureSpace();
        this.elements[totalOfElements++] = element;
    }

    public void add(int index, E element) {
        if (!isValidPosition(index)) {
            throw new IllegalArgumentException("Invalid index");
        }
        ensureSpace();
        for (int i = this.totalOfElements - 1; i >= index; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = element;
        this.totalOfElements++;
    }

    public E get(int index) {
        if (!isValidPosition(index)) {
            throw new IllegalArgumentException("Invalid index");
        }
        return (E) this.elements[index];
    }

    public void remove(int index) {
        if (!isBusyPosition(index)) {
            throw new IllegalArgumentException("Position is empty");
        }
        for (int i = index; i < this.totalOfElements - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.totalOfElements--;
        this.elements[totalOfElements] = null;
    }

    public boolean contains(E element) {
        for(int i = 0; i < totalOfElements; i++) {
            if (element.equals(this.elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return this.totalOfElements;
    }

    public String toString() {
        return Arrays.toString(this.elements);
    }

    private void ensureSpace() {
        if (this.totalOfElements == elements.length) {
            Object[] newArray = new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newArray[i] = this.elements[i];
            }
            this.elements = newArray;
        }
    }

    private boolean isValidPosition(int index) {
        return index >= 0 && index <= this.totalOfElements;
    }

    private boolean isBusyPosition(int index) {
        return index >= 0 && index < this.totalOfElements;
    }
}
