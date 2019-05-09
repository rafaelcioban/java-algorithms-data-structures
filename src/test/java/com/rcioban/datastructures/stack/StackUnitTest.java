package com.rcioban.datastructures.stack;

import com.rcioban.datastructures.domain.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StackUnitTest {

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
        testPush(car1);
        testPop();
        testGetSize_Empty();
        testPush(car2);
        testPush(car3);
        testPop();
        testPeek(car2);
    }

    private void testGetSize_Empty() {
        assertEquals(0, myStack.getSize());
        assertTrue(myStack.isEmpty());
    }

    private void testPush(Car car) {
        // When
        int size = myStack.getSize();
        myStack.push(car);

        // Then
        assertEquals(size+1, myStack.getSize());
        assertEquals(car, myStack.peek());
    }

    private void testPop() {
        // When
        int size = myStack.getSize();
        myStack.pop();

        // Then
        assertEquals(size-1, myStack.getSize());
    }

    private void testPeek(Car car) {
        // When
        Car c = myStack.peek();

        assertEquals(car, c);
    }
}
