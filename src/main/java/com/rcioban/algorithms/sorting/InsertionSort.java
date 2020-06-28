package com.rcioban.algorithms.sorting;

/**
 * Basic implementation of InsertionSort algorithm
 *
 * @author rcioban
 */
public class InsertionSort {

	public void sort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			int current = data[i];
			int j = i - 1;
			while (j >= 0 && data[j] >= current) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = current;
		}
	}

}
