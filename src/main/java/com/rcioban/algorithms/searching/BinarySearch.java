package com.rcioban.algorithms.searching;

/**
 * Basic implementation of BinarySearch algorithm
 *
 * @author rcioban
 */
public class BinarySearch {

    /**
     * @return the index of an element to be searched in a given array
     */
    public int search(int[] array, int element) {
        return binarySearch(array, element,0, array.length-1);
    }

    private int binarySearch(int[] array, int element, int low, int high) {
        if(low > high) return -1;

        int mid = (low + high) / 2;
        if(array[mid] < element) {
            return binarySearch(array, element, mid+1, high);
        } else if(array[mid] > element) {
            return binarySearch(array, element, low, mid-1);
        } else {
            return element;
        }
    }
}
