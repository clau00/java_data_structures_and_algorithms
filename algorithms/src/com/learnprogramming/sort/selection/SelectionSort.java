package com.learnprogramming.sort.selection;

//
//				|<---------------unsorted---------------->|
//			 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 |  35 | -15 |   7 |  55 |   1 | -22 |
//				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6
//
//		The array will be divided into partitions: sorted and unsorted.
//		Before the first step:
//			 - the sorted partition will be "null"
//			 - the unsorted partition will be the entire array, fromm index 0 to 6 - [0, 6].
//				 lastUnsortedIndex = 6 (array.length - 1) => this is the last index of the unsorted partition
//
//		A step means finding the biggest element int he unsorted partition and moving directly on the last position (of the unsorted partition).
//			 - save the index of the first element (indexOfBiggest) in the unsorted partition (we presume the first element is the biggest)
//			 - going from index 1 (the next element) through index = lastUnsortedIndex and ask if each element is greater than the element on index = indexOfBiggest
//				 = if true: save the index of the element into indexOfBiggest
//			 - at the end of each step we swap the element[indexOfBiggest] with element[lastUnsortedIndex]
//			 - after each step:
//					 = the biggest element will be on the last UNSORTED position
//					 = the sorted partition will grow with 1 element and the unsorted partition will be reduced by 1 element
//
//
//		During first step:
//				indexOfBiggest = 0 ( index of the first element )
//				go through 0 to 6 ( 6 = lastUnsortedIndex )
//				check if next element is greater than the element on indexOfBiggest (array[1] > array[0]). 35 > 20 (true) => indexOfBiggest = 1
//				take the next element and check if -15 > 35 (false) => continue
//				take the next element and check if 7 > 35 (false) => continue
//				take the next element and check if 55 > 35 (true) => indexOfBiggest = 4
//				take the next element and check if 1 > 55 (false) => continue
//				take the next element and check if -22 > 55 (false) => continue
//				reached the end of the loop => swap array[indexOfBiggest] with array[lastUnsortedIndex] (55 with -22)
//				lastUnsortedIndex-- and repeat
//
//		After first step (during this step we went from index 0 to 6):
//			 - the biggest element will be moved on position/index 6
//			 - the sorted partition will be [6] - index 6
//			 - the unsorted sorted partition will be [0, 5] - portion from index 0 to index 5
//
//				|<---------------unsorted---------------->|
//						  			     	____swap____
// 						  				   | __________ |
//										   || 		   ||
//										   \/  		   \/								|<------------unsorted------------->|<-sorted->|
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\				 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 |  35 | -15 |   7 |  55 |   1 | -22 |            \		array:	|  20 |  35 | -15 |   7 | -22 |   1 |  55 |
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6              /			index:	   0     1     2     3     4     5     6
//
//
//
//		After second step (during this step we went from index 0 to 5):
//			 - the second biggest element will be moved on position/index 5 (the biggest element is already on position 6)
//			 - the sorted partition will be [5, 6] - portion from index 5 to 6
//			 - the unsorted sorted partition will be [0, 4] - portion from index 0 to 4
//
//				|<------------unsorted------------->|<-sorted->|
//					  	  __________swap__________
// 						 | ______________________ |
//					 	 || 		  		     ||
//						 \/ 		     		 \/										|<---------unsorted---------->|<-sorted-->|
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\				 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 |  35 | -15 |   7 | -22 |   1 |  55 |            \		array:	|  20 |   1 | -15 |   7 | -22 |  35 |  55 |
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6              /			index:	   0     1     2     3     4     5     6

//
//		......
//
//		In the end the sorted partition will be [0, 6]
//
//

public class SelectionSort {

	public static void sort(int[] array) {
		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int indexOfBiggest = 0;
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(array[i] > array[indexOfBiggest]) {
					indexOfBiggest = i;
				}
			}
			swap(array, indexOfBiggest, lastUnsortedIndex);
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
