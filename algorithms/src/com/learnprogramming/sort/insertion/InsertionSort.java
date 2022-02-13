package com.learnprogramming.sort.insertion;

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
//
//		During first step:
//			 - we assume the sorted partition is [0] - index 0. the unsorted partition will become [1, 6] - firstUnsortedIndex = 1
//			 - we take the element[firstUnsortedIndex] and compare with each element from the sorted partition:
//			 	 = going from end to front, with i = [firstUnsortedIndex - 1, 0]
//				 = if the element[i] is less than the previous one(element[i-1]), we shift the element[i-1] one position to the right
//				 = we continue doing so until we reach i=0 or element[i-1] < element
//			 - after the search, we insert the element[firstUnsortedIndex] on index i
//			 - after each step, one element will be added to the sorted partition and one will be reduced from the unsorted one
//
//
//		First step:
//			 - in the beginning we take the sorted partition to be the first element in array, index = 0
//			 - the unsorted partition will be [1, 6] => firstUnsortedIndex = 1
//			 - we take/save the first element from the unsorted partition (array[firstUnsortedIndex] and compared it with all the elements from sorted one
//			 - in this case compare it with array[0], so, 35 > 20 => insert the 35 on position 1
//
//		   |<-sorted->|<------------unsorted------------->|								|<-sorted-->|<---------unsorted---------->|
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\				 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 |  35 | -15 |   7 |  55 |   1 | -22 |            \		array:	|  20 |  35 | -15 |   7 | -22 |   1 |  55 |
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6              /			index:	   0     1     2     3     4     5     6
//
//
//		Second step:
//			 - the sorted partition becomes [0, 1]
//			 - the unsorted partition will be [2, 6] => firstUnsortedIndex = 2
//			 - we take/save the first element from the unsorted partition (array[firstUnsortedIndex] and compared it with all the elements from sorted one
//				 = compare -15 with 35 => move 35 one position to the right
//				 = compare -15 with 20 => move 20 one position to the right
//				 = i = 0 (no elements left oto check) => insert -15 on i = 0.
//
//
//		        |<-sorted-->|<---------unsorted---------->|								|<-----sorted---->|<------unsorted------->|
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\				 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 |  35 | -15 |   7 |  55 |   1 | -22 |            \		array:	| -15 |  20 |  35 |   7 | -22 |   1 |  55 |
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6              /			index:	   0     1     2     3     4     5     6

//
//		......
//
//		In the end the sorted partition will be [0, 6]
//
//

public class InsertionSort {

	public static void sort(int[] array) {
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int selectedElement = array[firstUnsortedIndex];

			int i;
			for(i = firstUnsortedIndex; i > 0 && array[i - 1] > selectedElement; i--) {
				array[i] = array[i - 1];
			}

			array[i] = selectedElement;
		}
	}
}
