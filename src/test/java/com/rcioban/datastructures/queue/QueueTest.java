package com.rcioban.datastructures.queue;

import com.rcioban.datastructures.domain.Car;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class QueueTest {

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
        testAdd(this.car1);
        testAdd(this.car2);
        testPeek(this.car1);
        testAdd(this.car3);
        testPeek(this.car1);
        testRemove();
        testPeek(this.car2);
    }

    private void testGetSize_Empty() {
        assertEquals(0, this.myQueue.getSize());
        assertTrue(this.myQueue.isEmpty());
    }

    private void testAdd(final Car car) {
        // When
        final int size = this.myQueue.getSize();
        this.myQueue.add(car);

        // Then
        assertEquals(size + 1, this.myQueue.getSize());
    }

    private void testRemove() {
        // When
        final int size = this.myQueue.getSize();
        this.myQueue.remove();

        // Then
        assertEquals(size - 1, this.myQueue.getSize());
    }

    private void testPeek(final Car car) {
        // When
        final Car c = this.myQueue.peek();

        // Then
        assertEquals(car, c);
    }
}
