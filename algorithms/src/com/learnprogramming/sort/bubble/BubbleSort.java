package com.learnprogramming.sort.bubble;

public class BubbleSort {

	public static void sort(int[] array) {
		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
	}

	//	swap element on index i with element on index j in array "array"
	private static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
