package com.learnprogramming.sort.bubble;

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
//		A step means going element by element from index 0 to lastUnsortedIndex and asking if (array[i] > array[i+1])
//			 - if true: swap the elements
//			 - if not true(else): go to next element
//			 - after each step:
//					 = the biggest element will be on the last UNSORTED position
//					 = the sorted partition will grow with 1 element and the unsorted partition will be reduced by 1 element
//
//		After first step (during this step we went from index 0 to 6):
//			 - the biggest element will be moved on position/index 6
//			 - the sorted partition will be [6] - index 6
//			 - the unsorted sorted partition will be [0, 5] - portion from index 0 to index 5
//
//				|<---------------unsorted---------------->|
//						   swap																	     swap
// 						   / \																		 / \
//						  /   \																		/   \
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\			 	 _____ _____ _____ _____ _____ _____ _____ 		_______\
//		array:	|  20 |  35 | -15 |   7 |  55 |   1 | -22 |            \	array:	|  20 | -15 |  35 |   7 |  55 |   1 | -22 |		        \
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /			|_____|_____|_____|_____|_____|_____|_____|		_______ /
//		index:	   0     1     2     3     4     5     6              /		index:	   0     1     2     3     4     5     6   		       /
//
//										     swap																	  swap
// 						  				     / \																	   / \
//										    /   \																	  /   \
//			 	 _____ _____ _____ _____ _____ _____ _____     _______\			 	 _____ _____ _____ _____ _____ _____ _____ 		_______\
//		array:	|  20 | -15 |   7 |  35 |  55 |   1 | -22 |            \	array:	|  20 | -15 |  35 |   7 |   1 |  55 | -22 |		        \
//				|_____|_____|_____|_____|_____|_____|_____|    _______ /			|_____|_____|_____|_____|_____|_____|_____|		_______ /
//		index:	   0     1     2     3     4     5     6              /		index:	   0     1     2     3     4     5     6   		       /
//
//
//
//				|<-------------unsorted------------>|<-sorted->|
//														||
//														\/
//			 	 _____ _____ _____ _____ _____ _____ _____
//		array:	|  20 | -15 |   7 |  35 |   1 | -22 |  55 |
//				|_____|_____|_____|_____|_____|_____|_____|
//		index:	   0     1     2     3     4     5     6
//
//
//		After second step (during this step we went from index 0 to 5):
//			 - the second biggest element will be moved on position/index 5 (the biggest element is already on position 6)
//			 - the sorted partition will be [5, 6] - portion from index 5 to 6
//			 - the unsorted sorted partition will be [0, 4] - portion from index 0 to 4
//
//		......
//
//		In the end the sorted partition will be [0, 6]
//
//

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
