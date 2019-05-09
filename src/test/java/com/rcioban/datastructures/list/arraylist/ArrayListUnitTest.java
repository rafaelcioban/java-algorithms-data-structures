package com.rcioban.datastructures.list.arraylist;

import com.rcioban.datastructures.list.List;
import com.rcioban.datastructures.domain.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListUnitTest {

    private Car car1, car2, car3;
    private List<Car> myTestList;

    @Before
    public void setUp() {
        this.myTestList = new ArrayList();
        this.car1 = new Car("Ferrari");
        this.car2 = new Car("Bugatti");
        this.car3 = new Car("Porsche");
    }

    @Test
    public void testGeneralOperations() {
        testGetSize_Empty();
        testAddTwoElements();
        testContains();
        testGetByIndex();
        testAddByIndex();
        testRemove();
    }

    private void testGetSize_Empty() {
        assertEquals(0, myTestList.getSize());
    }

    private void testAddTwoElements() {
        // When
        myTestList.add(car1);
        myTestList.add(car2);

        // Then
        assertEquals(2, myTestList.getSize());
    }

    public void testContains() {
        assertTrue(myTestList.contains(car1));
        assertTrue(myTestList.contains(car2));
        assertFalse(myTestList.contains(car3));
    }

    public void testGetByIndex() {
        // When
        Car expectedCar = myTestList.get(1);

        // Then
        assertEquals(car2, expectedCar);
    }

    public void testAddByIndex() {
        // When
        myTestList.add(1, car3);

        // Then
        assertEquals(3, myTestList.getSize());
        assertEquals(car1, myTestList.get(0));
        assertEquals(car3, myTestList.get(1));
        assertEquals(car2, myTestList.get(2));
    }

    public void testRemove() {
        // When
        myTestList.remove(0);

        // Then
        assertEquals(2, myTestList.getSize());
        assertEquals(car3, myTestList.get(0));
        assertEquals(car2, myTestList.get(1));
    }


}
