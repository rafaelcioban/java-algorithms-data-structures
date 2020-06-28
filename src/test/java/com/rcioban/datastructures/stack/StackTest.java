package com.rcioban.datastructures.stack;

import com.rcioban.datastructures.domain.Car;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StackTest {

    private Car car1, car2, car3;
    private Stack<Car> myStack;

    @Before
    public void setUp() {
        this.myStack = new Stack();
        this.car1 = new Car("Ferrari");
        this.car2 = new Car("Bugatti");
        this.car3 = new Car("Porsche");
    }

    @Test
    public void testGeneralOperations() {
        testGetSize_Empty();
        testPush(this.car1);
        testPop();
        testGetSize_Empty();
        testPush(this.car2);
        testPush(this.car3);
        testPop();
        testPeek(this.car2);
    }

    private void testGetSize_Empty() {
        assertEquals(0, this.myStack.getSize());
        assertTrue(this.myStack.isEmpty());
    }

    private void testPush(final Car car) {
        // When
        final int size = this.myStack.getSize();
        this.myStack.push(car);

        // Then
        assertEquals(size + 1, this.myStack.getSize());
        assertEquals(car, this.myStack.peek());
    }

    private void testPop() {
        // When
        final int size = this.myStack.getSize();
        this.myStack.pop();

        // Then
        assertEquals(size - 1, this.myStack.getSize());
    }

    private void testPeek(final Car car) {
        // When
        final Car c = this.myStack.peek();

        assertEquals(car, c);
    }
}
