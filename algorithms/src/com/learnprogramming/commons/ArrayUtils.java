package com.learnprogramming.commons;

public class ArrayUtils {

	//	swap element on index i with element on index j in array "array"
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
