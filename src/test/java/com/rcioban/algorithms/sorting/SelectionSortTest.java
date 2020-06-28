package com.rcioban.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        // Given
        final int[] array = new int[]{3, 8, 99, 13, 22, 41, 58, 44, 1, 2, 4, 23, 98, 100, 32, 53, 9, 7, 88, 56, 67, 83, 204, 135};
        final int[] expected = new int[]{1, 2, 3, 4, 7, 8, 9, 13, 22, 23, 32, 41, 44, 53, 56, 58, 67, 83, 88, 98, 99, 100, 135, 204};

        // When
        new SelectionSort().sort(array);

        // Then
        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }
}
