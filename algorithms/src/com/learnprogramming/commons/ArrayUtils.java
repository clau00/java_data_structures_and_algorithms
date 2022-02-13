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

	public static void printArray(String typeOfSort, int[] array) {
		System.out.println("\n\t" + (typeOfSort == null ? "Unsorted Array:" : typeOfSort + ":"));
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.print(array[i] + "\n");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}

}
