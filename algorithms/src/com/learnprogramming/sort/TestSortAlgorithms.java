package com.learnprogramming.sort;

import java.util.Arrays;

import com.learnprogramming.sort.bubble.BubbleSort;
import com.learnprogramming.sort.selection.SelectionSort;

public class TestSortAlgorithms {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		applySort(Arrays.copyOf(intArray, intArray.length), "Bubble Sort");
		applySort(Arrays.copyOf(intArray, intArray.length), "Selection Sort");
    }

    private static void applySort(int[] array, String sortType) {
    	switch(sortType) {
			case "Bubble Sort":
				printArray(null, array);
				BubbleSort.sort(array);
				printArray(sortType, array);
				break;
			case "Selection Sort":
				printArray(null, array);
				SelectionSort.sort(array);
				printArray(sortType, array);
				break;
			default:
				System.out.println("Please enter \"Bubble Sort\" or \"Selection Sort\"!");
		}
	}

    private static void printArray(String typeOfSort, int[] array) {
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
