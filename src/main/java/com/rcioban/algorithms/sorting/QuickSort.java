package com.rcioban.algorithms.sorting;

import java.util.Arrays;

/**
 * Basic implementation of QuickSort algorithm
 *
 * @author rcioban
 */
public class QuickSort {

    public static void main(String[] args) {
        new QuickSort().sort(new int[]{8,3,1,4,6,2,5,7});
    }

    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    private void quickSort(int[] array, int left, int right) {
        System.out.println(String.format("quickSort() called => array=%s, left=%d, right=%d", Arrays.toString(array), left, right));
        if(left < right) {
            int pivotIndex = partition(array, left, right);
            System.out.println(String.format("quickSort() => returned pivotIndex=%d from partition()", pivotIndex));
            quickSort(array, left, pivotIndex-1);
            quickSort(array, pivotIndex, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivotIndex = (left + right)/2;
        int pivotElement = array[pivotIndex];
        System.out.println(String.format("partition() called => array=%s, left=%d, right=%d, pivotIndex=%d, array[%d]=%d", Arrays.toString(array), left, right, pivotIndex, pivotIndex, pivotElement));
        while(left <= right) {
            System.out.println(String.format("Outer while loop... left=%d, array[%d]=%d, right=%d, array[%d]=%d, pivotElement=%d", left, left, array[left], right, right, array[right], pivotElement));
            while (array[left] < pivotElement) {
                System.out.println(String.format("Left while loop... left=%d, array[%d]=%d, pivotElement=%d. Will increment left", left, left, array[left], pivotElement));
                left++;
            }
            while (array[right] > pivotElement) {
                System.out.println(String.format("Right while loop... right=%d, array[%d]=%d, pivotElement=%d. Will increment right", right, right, array[right], pivotElement));
                right--;
            }
            System.out.println(String.format("Finished Left/Right loops... array=%s, left=%d, array[%d]=%d, right=%d, array[%d]=%d", Arrays.toString(array), left, left, array[left], right, right, array[right]));
            if(left <= right) {
                swapItems(left, right, array);
                left++;
                right--;
                System.out.println(String.format("swaped items => array=%s, left=%d, right=%d", Arrays.toString(array), left, right));
            }
        }
        return left;
    }

    private void swapItems(int left, int right, int[] array) {
        System.out.println(String.format("swapItems() called => array=%s, left=%d, right=%d", Arrays.toString(array), left, right));
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
