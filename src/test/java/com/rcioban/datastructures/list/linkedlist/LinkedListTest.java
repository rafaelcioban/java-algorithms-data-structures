package com.rcioban.datastructures.list.linkedlist;

import com.rcioban.datastructures.domain.Car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LinkedListTest {

    private Car car1, car2, car3, car4, car5;
    private LinkedList<Car> myLinkedList;

    @Before
    public void setUp() {
        this.myLinkedList = new LinkedList();
        this.car1 = new Car("Ferrari");
        this.car2 = new Car("Bugatti");
        this.car3 = new Car("Porsche");
        this.car4 = new Car("Lamborghini");
        this.car5 = new Car("Maserati");
    }

    @Test
    public void testGeneralOperations() {
        testGetSize_Empty();
        testAddFirst(this.car3);
        System.out.println(this.myLinkedList);
        testAddFirst(this.car4);
        System.out.println(this.myLinkedList);
        testAddFirst(this.car1);
        System.out.println(this.myLinkedList);
        testAdd(this.car2);
        System.out.println(this.myLinkedList);
        testAddByIndex(2, this.car5);
        System.out.println(this.myLinkedList);
        testRemove(1);
        System.out.println(this.myLinkedList);
        testRemoveFirst();
        System.out.println(this.myLinkedList);
        testRemoveLast();
        System.out.println(this.myLinkedList);
    }

    private void testGetSize_Empty() {
        assertEquals(0, this.myLinkedList.getSize());
    }

    private void testAddFirst(final Car car) {
        // When
        this.myLinkedList.addFirst(car);

        assertEquals(car, this.myLinkedList.get(0));
    }

    private void testAdd(final Car car) {
        // When
        final int size = this.myLinkedList.getSize();
        this.myLinkedList.add(car);

        assertEquals(car, this.myLinkedList.get(size + 1));
        assertEquals(this.myLinkedList.getSize(), size + 1);
    }

    private void testAddByIndex(final int index, final Car car) {
        // When
        final int size = this.myLinkedList.getSize();
        this.myLinkedList.add(index, car);

        assertEquals(car, this.myLinkedList.get(index));
        assertEquals(this.myLinkedList.getSize(), size + 1);
    }

    private void testRemove(final int index) {
        // When
        final int size = this.myLinkedList.getSize();
        this.myLinkedList.remove(index);

        assertFalse(this.myLinkedList.contains(this.car4));
        assertEquals(this.myLinkedList.getSize(), size - 1);
    }

    private void testRemoveFirst() {
        // When
        final int size = this.myLinkedList.getSize();
        this.myLinkedList.removeFirst();

        assertFalse(this.myLinkedList.contains(this.car1));
        assertEquals(this.myLinkedList.getSize(), size - 1);
    }

    private void testRemoveLast() {
        // When
        final int size = this.myLinkedList.getSize();
        this.myLinkedList.removeLast();

        assertFalse(this.myLinkedList.contains(this.car2));
        assertEquals(this.myLinkedList.getSize(), size - 1);
    }
}
