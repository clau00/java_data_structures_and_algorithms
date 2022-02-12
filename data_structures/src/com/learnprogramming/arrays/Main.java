package com.learnprogramming.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        printArray(intArray);

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        printArray(intArray);

        //  get element at index = 3 => O(1)
        int index = 3;
        System.out.println("Element at index " + index + " is: " + intArray[3]);

        //  get element = -22 => O(n)
        int valueToSearch = -22;
        System.out.println("The index of element " + valueToSearch + " is: " + getElementIndex(valueToSearch, intArray));

    }

    //  return -1 in case the element was not found
    private static int getElementIndex(int searchedElement, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == searchedElement) {
                return i;
            }
        }
        return -1;
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
