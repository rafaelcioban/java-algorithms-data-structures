package com.rcioban.algorithms.sorting;

/**
 * Basic implementation of BubbleSort algorithm
 *
 * @author rcioban
 */
public class BubbleSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapItems(i, j, arr);
                }
            }
        }
    }

    private void swapItems(int index1, int index2, int[] arr) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
