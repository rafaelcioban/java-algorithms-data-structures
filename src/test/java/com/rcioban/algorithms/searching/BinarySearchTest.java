package com.rcioban.algorithms.searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        // Given
        final int[] array = new int[]{1, 2, 3, 4, 7, 8, 9, 13, 22, 23, 32, 41, 44, 53, 56, 58, 67, 83, 88, 98, 99, 100, 135, 204};
        final int element = 32;

        // When
        final int result = new BinarySearch().search(array, element);

        // Then
        assertEquals(element, result);
    }
}
