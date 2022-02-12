package com.learnprogramming.sort;

import com.learnprogramming.sort.bubble.BubbleSort;

public class TestSortAlgorithms {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //  apply bubble sort
        BubbleSort.sort(intArray);
        printArray(intArray);

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.print(array[i] + "\n");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(" ===================== ");
    }
}
