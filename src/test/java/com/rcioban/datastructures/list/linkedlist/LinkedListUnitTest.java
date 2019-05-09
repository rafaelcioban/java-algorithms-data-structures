package com.rcioban.datastructures.list.linkedlist;

import com.rcioban.datastructures.domain.Car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LinkedListUnitTest {

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
    public void testGeneralOperations(){
        testGetSize_Empty();
        testAddFirst(car3);
        System.out.println(myLinkedList);
        testAddFirst(car4);
        System.out.println(myLinkedList);
        testAddFirst(car1);
        System.out.println(myLinkedList);
        testAdd(car2);
        System.out.println(myLinkedList);
        testAddByIndex(2, car5);
        System.out.println(myLinkedList);
        testRemove(1);
        System.out.println(myLinkedList);
        testRemoveFirst();
        System.out.println(myLinkedList);
        testRemoveLast();
        System.out.println(myLinkedList);
    }

    private void testGetSize_Empty() {
        assertEquals(0, myLinkedList.getSize());
    }

    private void testAddFirst(Car car){
        // When
        myLinkedList.addFirst(car);

        assertEquals(car, myLinkedList.get(0));
    }

    private void testAdd(Car car){
        // When
        int size = myLinkedList.getSize();
        myLinkedList.add(car);

        assertEquals(car, myLinkedList.get(size+1));
        assertEquals(myLinkedList.getSize(), size+1);
    }

    private void testAddByIndex(int index, Car car){
        // When
        int size = myLinkedList.getSize();
        myLinkedList.add(index, car);

        assertEquals(car, myLinkedList.get(index));
        assertEquals(myLinkedList.getSize(), size+1);
    }

    private void testRemove(int index){
        // When
        int size = myLinkedList.getSize();
        myLinkedList.remove(index);

        assertFalse(myLinkedList.contains(car4));
        assertEquals(myLinkedList.getSize(), size-1);
    }

    private void testRemoveFirst(){
        // When
        int size = myLinkedList.getSize();
        myLinkedList.removeFirst();

        assertFalse(myLinkedList.contains(car1));
        assertEquals(myLinkedList.getSize(), size-1);
    }

    private void testRemoveLast(){
        // When
        int size = myLinkedList.getSize();
        myLinkedList.removeLast();

        assertFalse(myLinkedList.contains(car2));
        assertEquals(myLinkedList.getSize(), size-1);
    }
}
