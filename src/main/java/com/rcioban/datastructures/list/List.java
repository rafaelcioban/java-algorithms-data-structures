package com.rcioban.datastructures.list;

/**
 * Generic interface to implement different list types
 *
 * @author rcioban
 */
public interface List<E> {

    void add(E element);

    void add(int index, E element);

    E get(int index);

    void remove(int index);

    boolean contains(E element);

    int getSize();
}
