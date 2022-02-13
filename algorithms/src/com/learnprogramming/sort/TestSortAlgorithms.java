package com.learnprogramming.sort;

import java.util.Arrays;

import com.learnprogramming.commons.ArrayUtils;
import com.learnprogramming.sort.bubble.BubbleSort;
import com.learnprogramming.sort.insertion.InsertionSort;
import com.learnprogramming.sort.selection.SelectionSort;

public class TestSortAlgorithms {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		applySort(Arrays.copyOf(intArray, intArray.length), "Bubble Sort");
		applySort(Arrays.copyOf(intArray, intArray.length), "Selection Sort");
		applySort(Arrays.copyOf(intArray, intArray.length), "Insertion Sort");
    }

    private static void applySort(int[] array, String sortType) {
		ArrayUtils.printArray(null, array);
    	switch(sortType) {
			case "Bubble Sort":
				BubbleSort.sort(array);
				break;
			case "Selection Sort":
				SelectionSort.sort(array);
				break;
			case "Insertion Sort":
				InsertionSort.sort(array);
				break;
			default:
				System.out.println("Please enter \"Bubble Sort\" or \"Selection Sort\"!");
		}
		ArrayUtils.printArray(sortType, array);
	}

}
