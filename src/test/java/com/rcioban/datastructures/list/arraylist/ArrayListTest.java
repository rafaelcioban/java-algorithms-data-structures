package com.rcioban.datastructures.list.arraylist;

import com.rcioban.datastructures.domain.Car;
import com.rcioban.datastructures.list.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {

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
        assertEquals(0, this.myTestList.getSize());
    }

    private void testAddTwoElements() {
        // When
        this.myTestList.add(this.car1);
        this.myTestList.add(this.car2);

        // Then
        assertEquals(2, this.myTestList.getSize());
    }

    public void testContains() {
        assertTrue(this.myTestList.contains(this.car1));
        assertTrue(this.myTestList.contains(this.car2));
        assertFalse(this.myTestList.contains(this.car3));
    }

    public void testGetByIndex() {
        // When
        final Car expectedCar = this.myTestList.get(1);

        // Then
        assertEquals(this.car2, expectedCar);
    }

    public void testAddByIndex() {
        // When
        this.myTestList.add(1, this.car3);

        // Then
        assertEquals(3, this.myTestList.getSize());
        assertEquals(this.car1, this.myTestList.get(0));
        assertEquals(this.car3, this.myTestList.get(1));
        assertEquals(this.car2, this.myTestList.get(2));
    }

    public void testRemove() {
        // When
        this.myTestList.remove(0);

        // Then
        assertEquals(2, this.myTestList.getSize());
        assertEquals(this.car3, this.myTestList.get(0));
        assertEquals(this.car2, this.myTestList.get(1));
    }


}
