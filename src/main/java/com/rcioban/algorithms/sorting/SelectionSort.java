package com.rcioban.algorithms.sorting;

/**
 * Basic implementation of SelectionSort algorithm
 *
 * @author rcioban
 */
public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findIndexOfMinElement(i, array);
            swapItems(i, minIndex, array);
        }
    }

    private int findIndexOfMinElement(int startIndex, int[] data) {
        int minIndex = startIndex;
        for (int j = minIndex + 1; j < data.length; j++) {
            if (data[j] < data[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    private void swapItems(int index1, int index2, int[] data) {
        int tmp = data[index1];
        data[index1] = data[index2];
        data[index2] = tmp;
    }
}
