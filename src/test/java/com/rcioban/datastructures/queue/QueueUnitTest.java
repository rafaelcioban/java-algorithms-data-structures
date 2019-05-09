package com.rcioban.datastructures.queue;

import com.rcioban.datastructures.domain.Car;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class QueueUnitTest {

    private Car car1, car2, car3;
    private Queue<Car> myQueue;

    @Before
    public void setUp() {
        this.myQueue = new Queue();
        this.car1 = new Car("Ferrari");
        this.car2 = new Car("Bugatti");
        this.car3 = new Car("Porsche");
    }

    @Test
    public void testGeneralOperations() {
        testGetSize_Empty();
        testAdd(car1);
        testAdd(car2);
        testPeek(car1);
        testAdd(car3);
        testPeek(car1);
        testRemove();
        testPeek(car2);
    }

    private void testGetSize_Empty() {
        assertEquals(0, myQueue.getSize());
        assertTrue(myQueue.isEmpty());
    }

    private void testAdd(Car car) {
        // When
        int size = myQueue.getSize();
        myQueue.add(car);

        // Then
        assertEquals(size+1, myQueue.getSize());
    }

    private void testRemove() {
        // When
        int size = myQueue.getSize();
        myQueue.remove();

        // Then
        assertEquals(size-1, myQueue.getSize());
    }

    private void testPeek(Car car) {
        // When
        Car c = myQueue.peek();

        // Then
        assertEquals(car, c);
    }
}
